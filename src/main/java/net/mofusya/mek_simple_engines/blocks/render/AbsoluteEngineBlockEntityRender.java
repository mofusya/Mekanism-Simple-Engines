package net.mofusya.mek_simple_engines.blocks.render;

import net.mofusya.mek_simple_engines.blocks.entity.AbstractEngineBlockEntity;

public class AbsoluteEngineBlockEntityRender<T extends AbstractEngineBlockEntity> extends SimpleEngineBlockEntityRenderer<T> {
    public AbsoluteEngineBlockEntityRender() {
        super("wooden_engine_of_absolute_provision");
    }
}
