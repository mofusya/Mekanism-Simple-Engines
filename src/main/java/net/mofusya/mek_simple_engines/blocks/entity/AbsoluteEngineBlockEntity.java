package net.mofusya.mek_simple_engines.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.IEnergyStorage;
import net.mofusya.ornatelib.handler.ForgeEnergyHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AbsoluteEngineBlockEntity extends AbstractEngineBlockEntity {

    private final AbsoluteForgeEnergyHandler absoluteEnergyHandler;
    private LazyOptional<IEnergyStorage> lazyAbsoluteEnergyHandler;

    public AbsoluteEngineBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);

        this.absoluteEnergyHandler = new AbsoluteForgeEnergyHandler();
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (this.getLevel() == null) return LazyOptional.empty();

        if (cap == ForgeCapabilities.ENERGY){
            return this.lazyAbsoluteEnergyHandler.cast();
        }

        return LazyOptional.empty();
    }

    @Override
    public ForgeEnergyHandler createEnergyHandler(Runnable onChange) {
        return new ForgeEnergyHandler(Integer.MAX_VALUE, 0, Integer.MAX_VALUE) {
            @Override
            public void onChanged() {
                onChange.run();
            }
        };
    }

    @Override
    public void onLoad() {
        super.onLoad();
        this.lazyAbsoluteEnergyHandler = LazyOptional.of(this::getAbsoluteEnergyHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        this.lazyAbsoluteEnergyHandler.invalidate();
    }

    @Override
    public int getEnergyGenerationPerTick() {
        return Integer.MAX_VALUE;
    }

    public AbsoluteForgeEnergyHandler getAbsoluteEnergyHandler() {
        return absoluteEnergyHandler;
    }

    public static class AbsoluteForgeEnergyHandler implements IEnergyStorage {
        @Override
        public int receiveEnergy(int maxReceive, boolean simulate) {
            return 0;
        }

        @Override
        public int extractEnergy(int maxExtract, boolean simulate) {
            return maxExtract;
        }

        @Override
        public int getEnergyStored() {
            return Integer.MAX_VALUE;
        }

        @Override
        public int getMaxEnergyStored() {
            return Integer.MAX_VALUE;
        }

        @Override
        public boolean canExtract() {
            return true;
        }

        @Override
        public boolean canReceive() {
            return false;
        }
    }
}
