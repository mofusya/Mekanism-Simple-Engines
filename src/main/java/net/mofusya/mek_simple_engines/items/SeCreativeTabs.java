package net.mofusya.mek_simple_engines.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;
import net.mofusya.mek_simple_engines.C;
import net.mofusya.mek_simple_engines.blocks.SeBlocks;
import net.mofusya.ornatelib.registries.OrnateCreativeTabRegister;
import net.mofusya.ornatelib.util.ItemHelpers;

public class SeCreativeTabs {

    public static final OrnateCreativeTabRegister R = new OrnateCreativeTabRegister(C.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAIN = R.register("main", () -> new ItemStack(SeBlocks.WOODEN_ENGINE.get()), (parameters, output) -> {
        output.acceptAll(ItemHelpers.blockRegistries2ItemStacks(SeBlocks.R.getMainBlocks()));
    });
}
