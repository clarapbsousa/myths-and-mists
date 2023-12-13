package com.ldts.mythsmists.controller.game;

import com.googlecode.lanterna.screen.Screen;
import com.ldts.mythsmists.Game;
import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.model.Elements.Cerberus;
import com.ldts.mythsmists.model.Elements.Enemy;
import com.ldts.mythsmists.model.Elements.Orpheus;
import com.ldts.mythsmists.model.Position;
import com.ldts.mythsmists.model.game.map.Map;
import com.ldts.mythsmists.model.menu.Menu;
import com.ldts.mythsmists.states.MenuState;

import java.util.List;

public class CerberusController extends GameController {
    private boolean moveRight = true;

    public CerberusController(Map map) {
        super(map);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        List<Cerberus> cerberus = getModel().getCerberus();
        Position orpheusPosition = getModel().getOrpheus().getPosition();

        int max_W = 50;
        int max_L = 1;


        for (Cerberus cerb : cerberus) {

            int currentX = cerb.getPosition().getX();
            int currentY = cerb.getPosition().getY();

            if (currentX == 0) {
                moveRight = true;
                moveCerberus(cerb, cerb.getPosition().getDown());
            } else if (currentX == 10) {
                moveRight = false;
                moveCerberus(cerb, cerb.getPosition().getDown());
            } else {
                if (moveRight) {
                    moveCerberus(cerb, cerb.getPosition().getRight());
                } else {
                    moveCerberus(cerb, cerb.getPosition().getLeft());
                }
            }
            /*if (currentY == orpheusPosition.getY()) {
                game.setState(new MenuState(new Menu()));
            }*/

        }
    }

    private void moveCerberus(Cerberus cerberus, Position position) {
        if (getModel().isEmpty(position)) {
            cerberus.setPosition(position);
        }
    }
}