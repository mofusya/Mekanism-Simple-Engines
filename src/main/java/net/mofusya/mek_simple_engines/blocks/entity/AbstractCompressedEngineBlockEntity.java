package net.mofusya.mek_simple_engines.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.mofusya.ornatelib.handler.ForgeEnergyHandler;

public abstract class AbstractCompressedEngineBlockEntity extends AbstractEngineBlockEntity{

    public AbstractCompressedEngineBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public abstract int getCompressCount();

    @Override
    public ForgeEnergyHandler createEnergyHandler(Runnable onChange) {
        return new ForgeEnergyHandler(this.getCompressCount() * 20000, 0, this.getCompressCount() * 20000) {
            @Override
            public void onChanged() {
                onChange.run();
            }
        };
    }

    @Override
    public int getEnergyGenerationPerTick() {
        return this.getCompressCount() * 20;
    }
}
