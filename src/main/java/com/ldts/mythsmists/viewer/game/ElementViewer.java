package com.ldts.mythsmists.viewer.game;

import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.model.Elements.Cerberus;
import com.ldts.mythsmists.model.Elements.Element;

import java.util.List;

public interface ElementViewer<T extends Element> {
    void draw(T element, GUI gui);

}
