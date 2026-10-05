package net.mofusya.mek_simple_engines.blocks.block;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.mofusya.mek_simple_engines.blocks.SeBlockEntityTypes;
import net.mofusya.mek_simple_engines.blocks.entity.AbstractEngineBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbsoluteEngineBLock extends EngineBlock{
    public AbsoluteEngineBLock() {
        super(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion());
    }

    @Override
    public BlockEntityType<? extends AbstractEngineBlockEntity> getBlockEntityType() {
        return SeBlockEntityTypes.ABSOLUTE_WOODEN_ENGINE.get();
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable BlockGetter blockGetter, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(itemStack, blockGetter, tooltip, flag);

        tooltip.add(Component.translatable("block.mek_simple_engines.wooden_engine.fe_per_tick", Integer.MAX_VALUE).withStyle(ChatFormatting.GRAY));
    }
}
