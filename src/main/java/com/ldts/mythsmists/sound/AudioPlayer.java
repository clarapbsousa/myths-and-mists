package com.ldts.mythsmists.sound;

import javax.sound.sampled.*;
import java.io.File;

public class AudioPlayer {
    protected Clip clip;
    protected FloatControl fc;

    public AudioPlayer(String path) {
        try {
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path));
            clip = AudioSystem.getClip();
            clip.open(inputStream);
            fc = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void play(){
        clip.setFramePosition(0);
        fc.setValue(-10.0f);
        clip.start();
    }

    public void stop() {
        clip.stop();
    }

    public void volUp() {
        fc.setValue(-2.0f);
    }

    public void volDown() {
        fc.setValue(2.0f);
    }
}