package com.csitim.sc.model;

import com.csitim.sc.postprocessors.MyBeanNameAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Timea_Csiszar on 11/11/2016.
 */
public class Weapon implements MyBeanNameAware {

    private static final Logger logger= LoggerFactory.getLogger(Weapon.class);

    private String name;
    private int hit;
    private String beanName;

    public Weapon(String name, int hit) {
        logger.info("Weapon constructor called");
        this.name = name;
        this.hit = hit;
    }

    public String getName() {
        return name;
    }

    public int getHit() {
        return hit;
    }

    public void myInitMethod() {
        logger.info("Weapon myInitMethod called");
    }

    public void myDestroyMethod() {
        logger.info("Weapon myDestroyMethod called");
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
