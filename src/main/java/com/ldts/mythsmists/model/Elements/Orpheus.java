package com.ldts.mythsmists.model.Elements;

public class Orpheus extends Element{
    private int energy;
    private int count;

    public Orpheus(int x, int y) {
        super(x, y);
        this.energy = 10;
        this.count = 0;
    }

    public void decreaseEnergy() {
        this.energy--;
    }

    public void increaseCount() {
        this.count++;
    }

    public int getEnergy() {
        return energy;
    }

    public int getCount() {
        return count;
    }
}
