package com.ldts.mythsmists.model.game.map;

import com.ldts.mythsmists.model.Elements.Enemy;
import com.ldts.mythsmists.model.Elements.Orpheus;
import com.ldts.mythsmists.model.Elements.Wall;

import java.util.List;

public abstract class MapBuilder {

    public Map createMap() {
        Map map = new Map(getWidth(), getHeight());
        map.setOrpheus(createOrpheus());
        return map;
    }

    protected abstract int getWidth();

    protected abstract int getHeight();

    protected Orpheus createOrpheus(){
        return new Orpheus(getWidth()/2,getHeight()/2);
    }

    protected abstract List<Enemy> createEnemys();

    protected abstract List<Wall> createWalls();
}
