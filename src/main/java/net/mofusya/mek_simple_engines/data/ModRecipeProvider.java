package net.mofusya.mek_simple_engines.data;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.mofusya.mek_simple_engines.C;
import net.mofusya.mek_simple_engines.blocks.SeBlocks;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    private static void engineRecipe(Block baseIngredient, Block result, Consumer<FinishedRecipe> writer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("S%S")
                .pattern("#%#")
                .pattern("###")
                .define('S', Ingredient.of(ItemTags.WOODEN_SLABS))
                .define('%', Ingredient.of(baseIngredient))
                .define('#', Ingredient.of(ItemTags.LOGS))
                .unlockedBy(getHasName(baseIngredient), inventoryTrigger(ItemPredicate.Builder.item().of(baseIngredient).build()))
                .save(writer, C.MOD_ID + ":simple_" + getItemName(result));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, baseIngredient, 2)
                .requires(result)
                .unlockedBy(getHasName(result), inventoryTrigger(ItemPredicate.Builder.item().of(result).build()))
                .save(writer, C.MOD_ID + ":" + getItemName(baseIngredient) + "_from_separating");
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer) {
        engineRecipe(Blocks.PISTON, SeBlocks.WOODEN_ENGINE.get(), writer);
        engineRecipe(SeBlocks.WOODEN_ENGINE.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX2.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX2.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX3.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX3.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX4.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX4.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX5.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX5.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX6.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX6.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX7.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX7.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX8.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX8.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX9.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX9.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX10.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX10.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX11.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX11.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX12.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX12.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX13.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX13.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX14.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX14.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX15.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX15.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX16.get(), writer);
        engineRecipe(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX16.get(), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX17.get(), writer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SeBlocks.ABSOLUTE_WOODEN_ENGINE.get())
                .pattern("###")
                .pattern("#%#")
                .pattern("###")
                .define('%', Ingredient.of(Items.NETHER_STAR))
                .define('#', Ingredient.of(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX17.get()))
                .unlockedBy(getHasName(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX17.get()), inventoryTrigger(ItemPredicate.Builder.item().of(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX17.get()).build()))
                .save(writer, C.MOD_ID + ":simple_" + getItemName(SeBlocks.ABSOLUTE_WOODEN_ENGINE.get()));


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SeBlocks.COMPRESSED_WOODEN_ENGINE_XX17.get(), 8)
                .requires(SeBlocks.ABSOLUTE_WOODEN_ENGINE.get())
                .unlockedBy(getHasName(SeBlocks.ABSOLUTE_WOODEN_ENGINE.get()), inventoryTrigger(ItemPredicate.Builder.item().of(SeBlocks.ABSOLUTE_WOODEN_ENGINE.get()).build()))
                .save(writer, C.MOD_ID + ":" + getItemName(SeBlocks.COMPRESSED_WOODEN_ENGINE_XX17.get()) + "_from_separating");
    }
}
