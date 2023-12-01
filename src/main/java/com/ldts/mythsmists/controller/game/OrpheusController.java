package com.ldts.mythsmists.controller.game;

import com.ldts.mythsmists.Game;
import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.model.Position;
import com.ldts.mythsmists.model.game.map.Map;

public class OrpheusController extends GameController{

    public OrpheusController(Map map){super(map);}

    public void moveOrpheusLeft(){ move}

    public void moveOrpheus(Position position) {
        if(getModel().isEmpty(position)){
            getModel().getOrpheus().setPosition(position);
            //falta interação com os inimigos , terei que implementar na arena um bool com isso
        }
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.UP) moveOrpheusUp();
        if (action == GUI.ACTION.RIGHT) moveOrpheusRight();
        if (action == GUI.ACTION.DOWN) moveOrpheusDown();
        if (action == GUI.ACTION.LEFT) moveOrpheusLeft();
    }
}
