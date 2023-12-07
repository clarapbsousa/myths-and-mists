package com.ldts.mythsmists.controller.game;

import com.ldts.mythsmists.Game;
import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.model.Elements.Orpheus;
import com.ldts.mythsmists.model.Position;
import com.ldts.mythsmists.model.game.map.Map;

public class OrpheusController extends GameController{

    public OrpheusController(Map map){super(map);}

    public void moveOrpheusLeft(){ moveOrpheus(getModel().getOrpheus().getPosition().getLeft());}
    public void moveOrpheusRight(){ moveOrpheus(getModel().getOrpheus().getPosition().getRight());}
    public void moveOrpheusUp(){ moveOrpheus(getModel().getOrpheus().getPosition().getUp());}

    public void moveOrpheusDown(){ moveOrpheus(getModel().getOrpheus().getPosition().getDown());}

    public void moveOrpheus(Position position) {
        if(getModel().isEmpty(position)){
            getModel().getOrpheus().setPosition(position);
            if(!(getModel().isEnemy(position))){
                getModel().getOrpheus().decreaseEnergy();
            }
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
