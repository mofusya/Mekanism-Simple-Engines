package net.mofusya.mek_simple_engines.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.mofusya.mek_simple_engines.blocks.SeBlockEntityTypes;
import net.mofusya.ornatelib.handler.ForgeEnergyHandler;

public class WoodenEngineBlockEntity extends AbstractEngineBlockEntity{
    public WoodenEngineBlockEntity(BlockPos pos, BlockState state) {
        super(SeBlockEntityTypes.WOODEN_ENGINE.get(), pos, state);
    }

    @Override
    public ForgeEnergyHandler createEnergyHandler(Runnable onChange) {
        return new ForgeEnergyHandler(20000, 0, 20000) {
            @Override
            public void onChanged() {
                onChange.run();
            }
        };
    }

    @Override
    public int getEnergyGenerationPerTick() {
        return 20;
    }
}
