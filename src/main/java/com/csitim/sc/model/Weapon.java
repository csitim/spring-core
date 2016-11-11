package com.csitim.sc.model;

/**
 * Created by Timea_Csiszar on 11/11/2016.
 */
public class Weapon {
    private String name;
    private int hit;

    public Weapon(String name, int hit) {
        this.name = name;
        this.hit = hit;
    }

    public String getName() {
        return name;
    }

    public int getHit() {
        return hit;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", hit=" + hit +
                '}';
    }
}
