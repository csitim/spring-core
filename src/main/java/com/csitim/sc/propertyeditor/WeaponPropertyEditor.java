package com.csitim.sc.propertyeditor;

import com.csitim.sc.model.Weapon;

import java.beans.PropertyEditorSupport;

/**
 * Created by Timea_Csiszar on 11/21/2016.
 */
public class WeaponPropertyEditor extends PropertyEditorSupport{
    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        String[] values=text.split(",");

        String name = values[0];
        int hit = Integer.valueOf(values[1]);

        Weapon weapon = new Weapon(name, hit);
        setValue(weapon);
    }
}
