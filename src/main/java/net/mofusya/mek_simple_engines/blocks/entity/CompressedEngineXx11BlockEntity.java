package net.mofusya.mek_simple_engines.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CompressedEngineXx11BlockEntity extends AbstractCompressedEngineBlockEntity{
    public CompressedEngineXx11BlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    public int getCompressCount() {
        return 1024;
    }
}
