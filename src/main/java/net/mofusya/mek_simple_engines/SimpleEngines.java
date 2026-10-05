package net.mofusya.mek_simple_engines;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.mofusya.mek_simple_engines.blocks.SeBlockEntityTypes;
import net.mofusya.mek_simple_engines.blocks.SeBlocks;
import net.mofusya.mek_simple_engines.blocks.render.*;
import net.mofusya.mek_simple_engines.items.SeCreativeTabs;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

@Mod(SimpleEngines.MOD_ID)
public class SimpleEngines {
    public static final String MOD_ID = "mek_simple_engines";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SimpleEngines() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        SeBlocks.R.register(modEventBus);
        SeBlockEntityTypes.R.register(modEventBus);
        SeCreativeTabs.R.register(modEventBus);

        if (!FMLEnvironment.production) {
            GeckoLib.initialize();
        }

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class RegisterRenderers {

        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(SeBlockEntityTypes.WOODEN_ENGINE.get(), context -> new WoodenEngineBlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX2.get(), context -> new WoodenEngineXx2BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX3.get(), context -> new WoodenEngineXx3BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX4.get(), context -> new WoodenEngineXx4BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX5.get(), context -> new WoodenEngineXx5BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX6.get(), context -> new WoodenEngineXx6BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX7.get(), context -> new WoodenEngineXx7BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX8.get(), context -> new WoodenEngineXx8BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX9.get(), context -> new WoodenEngineXx9BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX10.get(), context -> new WoodenEngineXx10BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX11.get(), context -> new WoodenEngineXx11BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX12.get(), context -> new WoodenEngineXx12BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX13.get(), context -> new WoodenEngineXx13BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX14.get(), context -> new WoodenEngineXx14BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX15.get(), context -> new WoodenEngineXx15BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX16.get(), context -> new WoodenEngineXx16BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.COMPRESSED_WOODEN_ENGINE_XX17.get(), context -> new WoodenEngineXx17BlockEntityRender<>());
            event.registerBlockEntityRenderer(SeBlockEntityTypes.ABSOLUTE_WOODEN_ENGINE.get(), context -> new AbsoluteEngineBlockEntityRender<>());
        }
    }
}
