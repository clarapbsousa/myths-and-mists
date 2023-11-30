package com.ldts.mythsmists.model.game.map;

public abstract class MapBuilder {

    public Map createMap() {
        Map map = new Map(getWidth(), getHeight());

        return map;
    }

    protected abstract int getWidth();

    protected abstract int getHeight();
}
