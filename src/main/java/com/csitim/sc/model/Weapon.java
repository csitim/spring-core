package com.csitim.sc.model;

import com.csitim.sc.postprocessors.MyBeanNameAware;

/**
 * Created by Timea_Csiszar on 11/11/2016.
 */
public class Weapon implements MyBeanNameAware {
    private String name;
    private int hit;
    private String beanName;

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

    public String getBeanName() {
        return beanName;
    }

    public void myInitMethod(){
        System.out.println("Weapon myInitMethod called");
    }

    public void myDestroyMethod(){
        System.out.println("Weapon myDestroyMethod called");
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", hit=" + hit +
                ", beanName=" + beanName +
                '}';
    }
}
