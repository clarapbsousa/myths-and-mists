package com.ldts.mythsmists.controller.menu;

import com.ldts.mythsmists.controller.Controller;
import com.ldts.mythsmists.model.menu.Menu;
import com.ldts.mythsmists.Game;
import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.model.textsections.TextSection;
import com.ldts.mythsmists.states.PrologueState;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MenuController extends Controller<Menu> {

    public MenuController(Menu menu) {
        super(menu);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {

        List<String> sentences = Arrays.asList("Once upon a time in Greece, ",
                "there was a story",
                "about a loving newlywed couple",
                "that would soon face the biggest proof of love",
                "press enter to continue."
        );


        switch(action) {
            case UP:
                getModel().previousEntry();
                break;
            case DOWN:
                getModel().nextEntry();
                break;
            case SELECT:
                if (getModel().isSelectedStart()) game.setState(new PrologueState(new TextSection(sentences)));
                if (getModel().isSelectedExit()) game.setState(null);
                break;
        }
    }
}
