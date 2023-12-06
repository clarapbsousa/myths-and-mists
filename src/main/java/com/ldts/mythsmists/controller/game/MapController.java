package com.ldts.mythsmists.controller.game;

import com.ldts.mythsmists.Game;
import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.model.Elements.Orpheus;
import com.ldts.mythsmists.model.game.map.Map;
import com.ldts.mythsmists.model.menu.Menu;
import com.ldts.mythsmists.states.MenuState;

import java.io.IOException;

public class MapController extends GameController {
    private final OrpheusController orpheusController;
    private final EnemyController enemyController;

    public MapController(Map map) {
        super(map);
        this.orpheusController = new OrpheusController(map);
        this.enemyController = new EnemyController(map);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {

        System.out.println(1234);
        if (action == GUI.ACTION.QUIT) {
            game.setState(new MenuState(new Menu()));
        }
        else {
            orpheusController.step(game, action, time);
            enemyController.step(game, action, time);
        }
    }
}
