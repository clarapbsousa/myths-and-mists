package com.ldts.mythsmists.model.Elements;

public class Orpheus extends Element{
    private int energy;
    private int count;

    private boolean hasReachedCheckpoint;
    private boolean isLookSpace;

    private boolean lookback;

    public Orpheus(int x, int y) {
        super(x, y);
        this.energy = 10;
        this.count = 0;
        this.hasReachedCheckpoint = false;
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

    public boolean get_hasReachedCheckpoint() {
        return hasReachedCheckpoint;
    }

    public void setHasReachedCheckpoint() {
        this.hasReachedCheckpoint = true;
    }

    public boolean get_isLookSpace() {
        return isLookSpace;
    }

    public void set_isLookSpace() {
        this.isLookSpace = true;
    }

    public boolean get_lookback() {
        return lookback;
    }

    public void set_lookback() {
        this.lookback = true;
    }
}
