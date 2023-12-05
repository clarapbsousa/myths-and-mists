package com.ldts.mythsmists.model.game.map;

import com.ldts.mythsmists.model.Elements.Orpheus;

public abstract class MapBuilder {

    public Map createMap() {
        Map map = new Map(getWidth(), getHeight());
        map.setOrpheus(createOrpheus());
        return map;
    }

    protected abstract int getWidth();

    protected abstract int getHeight();

    protected abstract Orpheus createOrpheus();
}
