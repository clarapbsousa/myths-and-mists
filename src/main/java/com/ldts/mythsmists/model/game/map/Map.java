package com.ldts.mythsmists.model.game.map;

import com.ldts.mythsmists.model.Elements.Enemy;
import com.ldts.mythsmists.model.Elements.Orpheus;
import com.ldts.mythsmists.model.Elements.Wall;
import com.ldts.mythsmists.model.Position;

import java.util.List;

public class Map {
    private final int width;
    private final int height;

    private Orpheus orpheus;
    private List<Wall> walls;
    private List<Enemy> enemys;


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

    public List<Enemy> getEnemys(){return enemys;}

    public void setEnemys(List<Enemy> enemys){this.enemys = enemys;}

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

}
