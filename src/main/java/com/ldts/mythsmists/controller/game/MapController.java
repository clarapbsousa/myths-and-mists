package com.ldts.mythsmists.controller.game;

import com.ldts.mythsmists.Game;
import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.model.game.map.Map;
import com.ldts.mythsmists.model.menu.Menu;
import com.ldts.mythsmists.states.MenuState;

import java.io.IOException;

public class MapController extends GameController {

    public MapController(Map map) {
        super(map);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (action == GUI.ACTION.QUIT) {
            game.setState(new MenuState(new Menu()));
        }
    }
}
