package com.ldts.mythsmists.model.game.map;

import com.ldts.mythsmists.model.Elements.Enemy;
import com.ldts.mythsmists.model.Elements.Orpheus;
import com.ldts.mythsmists.model.Elements.Wall;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;

public class MapLoader extends MapBuilder {

    private final int lvl;

    private final List<String> lines;

    public MapLoader(int lvl) throws IOException {
        this.lvl = lvl;

        URL getLevelFile = MapLoader.class.getResource("/maps/map" + lvl + ".asset");
        BufferedReader reader = new BufferedReader(new FileReader(getLevelFile.getFile()));

        lines = readLines(reader);
    }

    private List<String> readLines(BufferedReader reader) throws IOException {
        List<String> lines = new ArrayList<>();
        for (String line; (line = reader.readLine()) != null;)
            lines.add(line);

        return lines;
    }

    @Override
    protected int getWidth() {
        int width = 0;
        for (String line : lines) width = Math.max(width, line.length());
        return width;
    }

    @Override
    protected int getHeight() {
        return lines.size();
    }

    @Override
    protected Orpheus createOrpheus() {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'Ä') return new Orpheus(x, y);
        }
        return null;
    }
    @Override
    protected List<Enemy> createEnemys() {
        List<Enemy> monsters = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'E') monsters.add(new Enemy(x, y));
        }
        return monsters;
    }
    @Override
    protected List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '#') walls.add(new Wall(x, y));
        }

        return walls;
    }

}
