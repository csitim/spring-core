package com.csitim.sc.model;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Timea_Csiszar on 11/22/2016.
 */
public class OgreWeaponFactoryBean implements FactoryBean<Weapon> {

    private static int counter = 0;

    @Override
    public Weapon getObject() throws Exception {
        counter++;
        return new Weapon("Weapon from factory #"+counter, 50);
    }

    @Override
    public Class<Weapon> getObjectType() {
        return Weapon.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
