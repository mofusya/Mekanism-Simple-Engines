package net.mofusya.mek_simple_engines.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.IEnergyStorage;
import net.mofusya.mek_simple_engines.C;
import net.mofusya.ornatelib.handler.ForgeEnergyHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

public abstract class AbstractEngineBlockEntity extends BlockEntity implements GeoBlockEntity {

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    private final ForgeEnergyHandler energyHandler;
    private LazyOptional<IEnergyStorage> lazyEnergyHandler;

    public AbstractEngineBlockEntity(BlockEntityType<?> type , BlockPos pos, BlockState state) {
        super(type, pos, state);

        this.energyHandler = this.createEnergyHandler(this::setChange);
    }

    public abstract ForgeEnergyHandler createEnergyHandler(Runnable onChange);

    public abstract int getEnergyGenerationPerTick();

    public void tick(Level level, BlockPos pos, BlockState state){
        ForgeEnergyHandler energyHandler = this.getEnergyHandler();

        if (energyHandler.getMaxEnergyStored() > energyHandler.getEnergyStored()){
            energyHandler.receiveEnergyFromInsider(this.getEnergyGenerationPerTick(), false);
        }
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, state -> {
            return state.setAndContinue(RawAnimation.begin().thenLoop("idle"));
        }));
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (this.getLevel() == null) return super.getCapability(cap, side);

        if (cap == ForgeCapabilities.ENERGY){
            return this.lazyEnergyHandler.cast();
        }

        return super.getCapability(cap, side);
    }


    @Override
    public void onLoad() {
        super.onLoad();
        this.lazyEnergyHandler = LazyOptional.of(this::getEnergyHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        this.lazyEnergyHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putInt(C.ENERGY, this.getEnergyHandler().getEnergyStored());
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        this.getEnergyHandler().setEnergy(tag.getInt(C.ENERGY));
    }

    public ForgeEnergyHandler getEnergyHandler() {
        return energyHandler;
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag() {
        return this.saveWithFullMetadata();
    }

    public void setChange() {
        Level level = this.getLevel();
        if (level == null) return;

        super.setChanged();
        level.sendBlockUpdated(this.getBlockPos(), this.getBlockState(), this.getBlockState(), 3);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
