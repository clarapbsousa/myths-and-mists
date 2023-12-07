package com.ldts.mythsmists.model.game.map;

import com.ldts.mythsmists.model.Elements.Orpheus;
import com.ldts.mythsmists.model.Elements.Wall;

import java.util.ArrayList;
import java.util.List;

public class MapBuilder {
    private int width;
    private int height;

    public MapBuilder(){
    }

    public MapBuilder(int width,int height) {
        this.width = width;
        this.height= height;
    }

    public Map createMap() {
        Map map = new Map(width, height);

        map.setOrpheus(createOrpheus());
        map.setWalls(createWalls());
        return map;
    }

    protected Orpheus createOrpheus(){
        return new Orpheus(width/2,height/2);
    }

    protected List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int x = 0; x < width; x++) {
            walls.add(new Wall(x, 0));
            walls.add(new Wall(x, height - 1));
        }

        for (int y = 1; y < height - 1; y++) {
            walls.add(new Wall(0, y));
            walls.add(new Wall(width - 1, y));
        }

        return walls;
    }
}
