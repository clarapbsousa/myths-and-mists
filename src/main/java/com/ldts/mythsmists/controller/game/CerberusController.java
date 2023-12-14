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
    boolean moveRight = true;

    public CerberusController(Map map) {
        super(map);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        List<Cerberus> cerberus = getModel().getCerberus();
        Position orpheusPosition = getModel().getOrpheus().getPosition();

        // Verifica se pelo menos um Cerberus está na posição 0
        boolean atPosition0 = cerberus.stream().anyMatch(cerb -> cerb.getPosition().getX() == 1);

        // Verifica se pelo menos um Cerberus está na posição 10
        boolean atPosition10 = cerberus.stream().anyMatch(cerb -> cerb.getPosition().getX() == 10);

        for (Cerberus cerb : cerberus) {
            int currentX = cerb.getPosition().getX();
            int currentY = cerb.getPosition().getY();

            if (atPosition0) {
                moveRight = true;
                moveCerberus(cerb, cerb.getPosition().getDown());
            } else if (atPosition10) {
                moveCerberus(cerb, cerb.getPosition().getLeft());
                moveRight = false;
            } else {
                if (moveRight){ moveCerberus(cerb, cerb.getPosition().getRight());}
                else { moveCerberus(cerb, cerb.getPosition().getLeft());}
            }
        }
    }



    private void moveCerberus(Cerberus cerberus, Position position) {
        if (getModel().isEmpty(position)) {
            cerberus.setPosition(position);
        }
    }
}