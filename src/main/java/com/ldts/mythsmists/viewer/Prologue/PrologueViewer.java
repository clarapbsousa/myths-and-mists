package com.ldts.mythsmists.viewer.Prologue;

import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.model.Position;
import com.ldts.mythsmists.model.game.map.Map;
import com.ldts.mythsmists.viewer.Viewer;

public class PrologueViewer extends Viewer<Map> {
    public PrologueViewer(Map prologue) { super(prologue); }
    @Override
    protected void drawElements(GUI gui) {
        int i = 2;
        switch (i) {
            case 2:
                gui.drawText(new Position(1, 2), "However, if you want to defy death, you should first pay the price.", "#FFFFFF");
                i--;
            case 1:
                gui.drawText(new Position(1, 4), "Colect 10 Dracmas, pay Caronte and cross the river", "#FFFFFF");
                i--;
            case 0:
                gui.drawText(new Position(1, 6), "Or remain in the Underwrold forever.", "#f50202");
                break;
            default:
                break;
        }
    }
}
