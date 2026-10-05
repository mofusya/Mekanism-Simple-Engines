package net.mofusya.mek_simple_engines.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.mofusya.ornatelib.handler.ForgeEnergyHandler;

public class CompressedEngineXx2BlockEntity extends AbstractCompressedEngineBlockEntity{
    public CompressedEngineXx2BlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    public int getCompressCount() {
        return 2;
    }
}
