package com.ldts.mythsmists.viewer.game;

import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.model.Elements.Element;
import com.ldts.mythsmists.model.Position;
import com.ldts.mythsmists.model.game.map.Map;
import com.ldts.mythsmists.viewer.Viewer;

import java.util.Collections;
import java.util.List;

public class MapViewer extends Viewer<Map> {

    public MapViewer(Map map) {
        super(map);
    }


    @Override
    protected void drawElements(GUI gui) {

        gui.drawText(new Position(1, 0), "Collect the coins and follow to the Underworld.", "#FFFFFF");
        gui.drawText(new Position(1, 1),"DO NOT GET CAUGHT!", "#FF0000" );

        gui.drawText(new Position(1, 3), "Energy: " + getModel().getOrpheus().getEnergy(), "#FFD700");

        drawElements(gui, getModel().getWalls(), new WallViewer());
        drawElements(gui, getModel().getEnemys(), new EnemyViewer());
        drawElement(gui, getModel().getOrpheus(), new OrpheusViewer());
    }

    private <T extends Element> void drawElements(GUI gui, List<T> elements, ElementViewer<T> viewer) {
        List<T> validElements = (elements != null) ? elements : Collections.emptyList();

        for (T element : validElements) {
            drawElement(gui, element, viewer);
        }
    }

    private <T extends Element> void drawElement(GUI gui, T element, ElementViewer<T> viewer) {
        viewer.draw(element, gui);
    }

}
