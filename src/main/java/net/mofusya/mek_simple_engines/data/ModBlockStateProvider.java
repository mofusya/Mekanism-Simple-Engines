package net.mofusya.mek_simple_engines.data;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.mofusya.mek_simple_engines.C;
import net.mofusya.mek_simple_engines.blocks.SeBlocks;

import java.util.ArrayList;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, C.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ArrayList<RegistryObject<Block>> registries = new ArrayList<>();

        for (RegistryObject<Block> block : registries) {
            this.blockWithItem(block);
        }

        for (RegistryObject<Block> engine : SeBlocks.R.getMainBlocks()) {
            this.engineBlock(engine);
        }
    }

    private void blockWithItem(RegistryObject<Block> block) {
        this.simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }

    private void engineBlock(RegistryObject<Block> block) {
        String name = block.getId().getPath();

        ModelFile model = models()
                .withExistingParent(name, modLoc("block/simple_engine"))
                .texture("0", modLoc("block/" + name))
                .texture("particle", modLoc("block/" + name));

        this.getVariantBuilder(block.get()).forAllStates(state -> ConfiguredModel.builder().modelFile(model).build());

        this.itemModels().withExistingParent(name, modLoc("block/" + name));
    }
}
