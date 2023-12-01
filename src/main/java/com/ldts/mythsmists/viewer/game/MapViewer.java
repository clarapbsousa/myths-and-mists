package com.ldts.mythsmists.viewer.game;

import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.model.Position;
import com.ldts.mythsmists.model.game.map.Map;
import com.ldts.mythsmists.viewer.Viewer;

public class MapViewer extends Viewer<Map> {

    public MapViewer(Map map) {
        super(map);
    }


    @Override
    protected void drawElements(GUI gui) {
        gui.drawText(new Position(0, 0), "Shall you look back?", "#FFFFFF");
    }

    // needs more functions to be able to draw elements
}
