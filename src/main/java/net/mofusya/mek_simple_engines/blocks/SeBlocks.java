package net.mofusya.mek_simple_engines.blocks;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.mofusya.mek_simple_engines.C;
import net.mofusya.mek_simple_engines.blocks.block.AbsoluteEngineBLock;
import net.mofusya.mek_simple_engines.blocks.block.SimpleEngineBlock;
import net.mofusya.ornatelib.registries.OrnateBlockRegister;

public class SeBlocks {
    public static final OrnateBlockRegister R = new OrnateBlockRegister(C.MOD_ID);

    public static final RegistryObject<Block> WOODEN_ENGINE = R.register("wooden_engine", () -> new SimpleEngineBlock(SeBlockEntityTypes.WOODEN_ENGINE::get, 1), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX2 = R.register("wooden_engine_xx2", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX2::get, 2), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX3 = R.register("wooden_engine_xx3", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX3::get, 4), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX4 = R.register("wooden_engine_xx4", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX4::get, 8), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX5 = R.register("wooden_engine_xx5", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX5::get, 16), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX6 = R.register("wooden_engine_xx6", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX6::get, 32), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX7 = R.register("wooden_engine_xx7", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX7::get, 64), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX8 = R.register("wooden_engine_xx8", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX8::get, 128), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX9 = R.register("wooden_engine_xx9", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX9::get, 256), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX10 = R.register("wooden_engine_xx10", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX10::get, 512), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX11 = R.register("wooden_engine_xx11", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX11::get, 1024), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX12 = R.register("wooden_engine_xx12", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX12::get, 2048), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX13 = R.register("wooden_engine_xx13", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX13::get, 4096), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX14 = R.register("wooden_engine_xx14", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX14::get, 8192), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX15 = R.register("wooden_engine_xx15", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX15::get, 16384), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX16 = R.register("wooden_engine_xx16", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX16::get, 32768), getBuildForEngine());
    public static final RegistryObject<Block> COMPRESSED_WOODEN_ENGINE_XX17 = R.register("wooden_engine_xx17", () -> new SimpleEngineBlock(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX17::get, 65536), getBuildForEngine());

    public static final RegistryObject<Block> ABSOLUTE_WOODEN_ENGINE = R.register("wooden_engine_of_absolute_provision", AbsoluteEngineBLock::new, getBuildForEngine());

    public static Item.Properties getBuildForEngine(){
        return new Item.Properties();
    }
}
