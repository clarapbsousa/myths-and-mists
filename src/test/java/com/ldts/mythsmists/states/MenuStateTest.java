package com.ldts.mythsmists.states;

import com.ldts.mythsmists.controller.menu.MenuController;
import com.ldts.mythsmists.model.menu.Menu;
import com.ldts.mythsmists.viewer.menu.MenuViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuStateTest {

    private Menu menu;
    private MenuState state;

    @BeforeEach
    void setup() {
        menu = new Menu();
        state = new MenuState(menu);
    }

    @Test
    void stateChecker() {
        MenuViewer viewer = new MenuViewer(menu);
        MenuController controller = new MenuController(menu);
        assertEquals(state.getController(), controller);
        assertEquals(state.getViewer(), viewer);
    }
}
