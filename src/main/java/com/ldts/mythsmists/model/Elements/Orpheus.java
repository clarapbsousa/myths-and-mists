package com.ldts.mythsmists.model.Elements;

public class Orpheus extends Element{
    private int energy;

    public Orpheus(int x, int y) {
        super(x, y);
        this.energy = 10;
    }

    public void decreaseEnergy() {
        this.energy--;
    }

    public int getEnergy() {
        return energy;
    }
}
