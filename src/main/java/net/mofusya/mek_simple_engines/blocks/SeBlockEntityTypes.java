package net.mofusya.mek_simple_engines.blocks;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;
import net.mofusya.mek_simple_engines.C;
import net.mofusya.mek_simple_engines.blocks.entity.*;
import net.mofusya.ornatelib.registries.OrnateBlockEntityTypeRegister;

public class SeBlockEntityTypes {
    public static final OrnateBlockEntityTypeRegister R = new OrnateBlockEntityTypeRegister(C.MOD_ID);

    public static final RegistryObject<BlockEntityType<WoodenEngineBlockEntity>> WOODEN_ENGINE = R.register("wooden_engine",
            () -> BlockEntityType.Builder.of(WoodenEngineBlockEntity::new, SeBlocks.WOODEN_ENGINE.get()).build(null));

    public static final RegistryObject<BlockEntityType<CompressedEngineXx2BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX2 = R.register("wooden_engine_xx2", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx2BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX2.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX2.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx3BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX3 = R.register("wooden_engine_xx3", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx3BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX3.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX3.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx4BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX4 = R.register("wooden_engine_xx4", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx4BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX4.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX4.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx5BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX5 = R.register("wooden_engine_xx5", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx5BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX5.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX5.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx6BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX6 = R.register("wooden_engine_xx6", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx6BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX6.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX6.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx7BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX7 = R.register("wooden_engine_xx7", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx7BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX7.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX7.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx8BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX8 = R.register("wooden_engine_xx8", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx8BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX8.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX8.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx9BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX9 = R.register("wooden_engine_xx9", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx9BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX9.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX9.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx10BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX10 = R.register("wooden_engine_xx10", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx10BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX10.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX10.get()).build(null));

    public static final RegistryObject<BlockEntityType<CompressedEngineXx11BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX11 = R.register("wooden_engine_xx11", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx11BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX11.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX11.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx12BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX12 = R.register("wooden_engine_xx12", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx12BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX12.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX12.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx13BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX13 = R.register("wooden_engine_xx13", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx13BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX13.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX13.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx14BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX14 = R.register("wooden_engine_xx14", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx14BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX14.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX14.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx15BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX15 = R.register("wooden_engine_xx15", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx15BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX15.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX15.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx16BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX16 = R.register("wooden_engine_xx16", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx16BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX16.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX16.get()).build(null));
    public static final RegistryObject<BlockEntityType<CompressedEngineXx17BlockEntity>> COMPRESSED_WOODEN_ENGINE_XX17 = R.register("sexdecuple_compressed_wooden_engine", () -> BlockEntityType.Builder.of((pos, state) ->
            new CompressedEngineXx17BlockEntity(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX17.get(), pos, state), SeBlocks.COMPRESSED_WOODEN_ENGINE_XX17.get()).build(null));

    public static final RegistryObject<BlockEntityType<AbsoluteEngineBlockEntity>> ABSOLUTE_WOODEN_ENGINE = R.register("wooden_engine_of_absolute_provision", () -> BlockEntityType.Builder.of((pos, state) ->
            new AbsoluteEngineBlockEntity(SeBlockEntityTypes.ABSOLUTE_WOODEN_ENGINE.get(), pos, state), SeBlocks.ABSOLUTE_WOODEN_ENGINE.get()).build(null));
}
