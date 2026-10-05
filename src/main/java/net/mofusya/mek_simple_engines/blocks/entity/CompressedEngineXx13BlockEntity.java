package net.mofusya.mek_simple_engines.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CompressedEngineXx13BlockEntity extends AbstractCompressedEngineBlockEntity{
    public CompressedEngineXx13BlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    public int getCompressCount() {
        return 4096;
    }
}
