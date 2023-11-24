package com.ldts.mythsmists;

import com.ldts.mythsmists.gui.LanternaGUI;
import com.ldts.mythsmists.states.State;
import com.ldts.mythsmists.states.MenuState;
import com.ldts.mythsmists.model.menu.Menu;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class Game {

    private final LanternaGUI gui;
    private State state;

    public Game() throws IOException, URISyntaxException, FontFormatException {
        this.gui = new LanternaGUI(20, 20);
        this.state = new MenuState(new Menu());
    }

}
