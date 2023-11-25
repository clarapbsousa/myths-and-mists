package com.ldts.mythsmists.controller.textsections;

import com.ldts.mythsmists.Game;
import com.ldts.mythsmists.controller.Controller;
import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.model.textsections.TextSection;
import com.ldts.mythsmists.states.PrologueState;
import org.w3c.dom.Text;

import java.io.IOException;

public class PrologueController extends Controller<TextSection> {

    public PrologueController(TextSection prologue) {
        super(prologue);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (action == GUI.ACTION.SELECT) game.setState(null);
    }
}
