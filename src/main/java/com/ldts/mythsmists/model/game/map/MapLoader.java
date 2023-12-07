package com.ldts.mythsmists.model.game.map;

import com.ldts.mythsmists.model.Elements.Orpheus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;

public class MapLoader extends MapBuilder {

    private final List<String> lines;

    public MapLoader() throws IOException {
        super();

        URL getMapFile = MapLoader.class.getResource("/maps/map1.asset");
        assert getMapFile != null;
        BufferedReader reader = new BufferedReader(new FileReader(getMapFile.getFile()));

        lines = readLines(reader);
    }

    private List<String> readLines(BufferedReader reader) throws IOException {
        List<String> lines = new ArrayList<>();
        for (String line; (line = reader.readLine()) != null;)
            lines.add(line);

        return lines;
    }

    protected int getWidth() {
        int width = 0;
        for (String line : lines) width = Math.max(width, line.length());
        return width;
    }

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


}
