package net.mofusya.mek_simple_engines.blocks.render;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.mofusya.mek_simple_engines.C;
import net.mofusya.mek_simple_engines.blocks.entity.AbstractEngineBlockEntity;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class SimpleEngineBlockEntityRenderer<T extends AbstractEngineBlockEntity> extends GeoBlockRenderer<T> {
    public SimpleEngineBlockEntityRenderer(String id) {
        super(new DefaultedBlockGeoModel<>(new ResourceLocation(C.MOD_ID, "simple_engine")) {
            @Override
            public ResourceLocation getTextureResource(T animatable) {
                return this.buildFormattedTexturePath(new ResourceLocation(C.MOD_ID, id));
            }

            @Override
            public RenderType getRenderType(T animatable, ResourceLocation texture) {
                return RenderType.entityTranslucent(this.getTextureResource(animatable));
            }
        });
    }
}
