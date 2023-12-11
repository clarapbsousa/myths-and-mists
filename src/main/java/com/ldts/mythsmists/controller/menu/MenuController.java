package com.ldts.mythsmists.controller.menu;

import com.ldts.mythsmists.controller.Controller;
import com.ldts.mythsmists.model.menu.Menu;
import com.ldts.mythsmists.Game;
import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.model.menu.OptionsMenu;
import com.ldts.mythsmists.model.textsections.TextSection;
import com.ldts.mythsmists.states.OptionsMenuState;
import com.ldts.mythsmists.states.PrologueState;


import java.io.IOException;

public class MenuController extends Controller<Menu> {

    public MenuController(Menu menu) {
        super(menu);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch(action) {
            case UP:
                getModel().previousEntry();
                break;
            case DOWN:
                getModel().nextEntry();
                break;
            case SELECT:
                if (getModel().isSelectedStart()) game.setState(new PrologueState(new TextSection()));
                if (getModel().isSelectedExit()) game.setState(null);
                if (getModel().isSelectedOptions()) game.setState(new OptionsMenuState(new OptionsMenu()));
                break;
        }
    }
}
