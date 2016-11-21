package com.csitim.sc.model;

/**
 * Created by Timea_Csiszar on 11/11/2016.
 */
public class Weapon {
    private String name;
    private int hit;

    public Weapon(String name, int hit) {
        System.out.println("Weapon constructor called");
        this.name = name;
        this.hit = hit;
    }

    public String getName() {
        return name;
    }

    public int getHit() {
        return hit;
    }

    public void myInitMethod(){
        System.out.println("Weapon myInitMethod called");
    }

    public void myDestroyMethod(){
        System.out.println("Weapon myDestroyMethod called");
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", hit=" + hit +
                '}';
    }
}
