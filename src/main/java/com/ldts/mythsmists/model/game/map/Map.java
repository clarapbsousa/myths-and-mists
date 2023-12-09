package com.ldts.mythsmists.model.game.map;

import com.ldts.mythsmists.model.Elements.*;
import com.ldts.mythsmists.model.Position;
import com.ldts.mythsmists.model.textsections.TextSection;

import java.util.List;

public class Map {
    private final int width;
    private final int height;

    private Orpheus orpheus;
    private List<Wall> walls;
    private List<Enemy> enemys;
    private List<Dracma> dracmas;

    private Checkpoint checkpoint;

    private List<Water> rivers;


    public Map(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Orpheus getOrpheus() {
        return orpheus;
    }

    public void setOrpheus(Orpheus orpheus) {
        this.orpheus = orpheus;
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public List<Dracma> getDracmas() { return dracmas; }

    public void setDracmas(List<Dracma> dracmas) {
        this.dracmas = dracmas;
    }

    public List<Enemy> getEnemys(){return enemys;}

    public void setEnemys(List<Enemy> enemys){this.enemys = enemys;}

    public List<Water> getRivers() {
        return rivers;
    }

    public void setRivers(List<Water> rivers) {
        this.rivers = rivers;
    }

    public Checkpoint getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(Checkpoint checkpoint) {
        this.checkpoint = checkpoint;
    }

    public boolean isEmpty(Position position) {
        for (Wall wall: walls){
            if(wall.getPosition().equals(position))
                return false;
        }
        return true;
    }

    public boolean isEnemy(Position position) {
        for (Enemy enemy: enemys){
            if(enemy.getPosition().equals(position))
                return false;
        }
        return true;
    }
    public boolean isDracma(Position position) {
        for (Dracma dracma: dracmas){
            if(dracma.getPosition().equals(position))
                return false;
        }
        return true;
    }

    public boolean isCheckpoint(Position position) {
        if (checkpoint.getPosition().equals(position)) return false;
        return true;
    }

}
