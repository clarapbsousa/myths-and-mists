package com.ldts.mythsmists.states;

import com.ldts.mythsmists.controller.Controller;
import com.ldts.mythsmists.controller.textsections.PrologueController;
import com.ldts.mythsmists.model.textsections.TextSection;
import com.ldts.mythsmists.viewer.Viewer;
import com.ldts.mythsmists.viewer.textsections.TextSectionViewer;

import java.util.Arrays;
import java.util.List;


public class PrologueState extends State<TextSection> {

    public PrologueState(TextSection ts) {
        super(ts);
        List<String> sentences = Arrays.asList("Once upon a time in Greece, ",
                "there was a story",
                "about a loving newlywed couple",
                "that would soon face the biggest proof of love",
                "press enter to continue."
        );
        ts.setSentences(sentences);
    }

    @Override
    protected Viewer<TextSection> getViewer() {
        return new TextSectionViewer(getModel());
    }

    @Override
    protected Controller<TextSection> getController() {
        return new PrologueController(getModel());
    }
}