package com.ldts.mythsmists.controller.game;

import com.googlecode.lanterna.screen.Screen;
import com.ldts.mythsmists.Game;
import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.model.Elements.Cerberus;
import com.ldts.mythsmists.model.Elements.Enemy;
import com.ldts.mythsmists.model.Elements.Orpheus;
import com.ldts.mythsmists.model.Position;
import com.ldts.mythsmists.model.game.map.Map;

import java.util.List;

public class CerberusController extends GameController {
    public CerberusController(Map map) {
        super(map);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        List<Cerberus> cerberus = getModel().getCerberus();
        Position orpheusPosition = getModel().getOrpheus().getPosition();

        if (cerberus != null) {
            int max_W = 50;
            int max_L = 50;

            for (Cerberus cerb : cerberus) {
                int speedX = 1;
                int speedY = 8;

                int currentX = cerb.getPosition().getX();
                int currentY = cerb.getPosition().getY();

                if (currentX + speedX <= max_W) {
                    cerb.setPosition(new Position(currentX + speedX, currentY));
                } else {
                    cerb.setPosition(new Position(max_W, currentY + speedY));

                    if (currentX - speedX >= max_L) {
                        cerb.setPosition(new Position(currentX - speedX, currentY));
                    } else {
                        // If at maxLeft, move down and change direction
                        cerb.setPosition(new Position(max_L, currentY + speedY));
                    }
                }
            }
        }
    }

    private void moveCerberus(Cerberus cerberus, Position position) {
        if (getModel().isEmpty(position)) {
            cerberus.setPosition(position);
        }
    }
}
