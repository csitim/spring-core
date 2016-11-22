package com.csitim.sc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Timea_Csiszar on 11/11/2016.
 */
public class Character {
    private String name;
    private int hp;
    private Weapon weapon;
    private List<Character> associates;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.associates = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setAssociates(List<Character> associates) {
        this.associates = associates;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", weapon=" + weapon +
                ", associates=" + associates +
                '}';
    }
}
