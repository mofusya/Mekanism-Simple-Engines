package net.mofusya.mek_simple_engines.blocks.render;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.mofusya.mek_simple_engines.C;
import net.mofusya.mek_simple_engines.blocks.entity.AbstractEngineBlockEntity;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class WoodenEngineBlockEntityRender<T extends AbstractEngineBlockEntity> extends SimpleEngineBlockEntityRenderer<T> {
    public WoodenEngineBlockEntityRender() {
        super("wooden_engine");
    }
}
