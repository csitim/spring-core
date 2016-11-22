package com.csitim.sc.converter;

import com.csitim.sc.model.Weapon;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by Timea_Csiszar on 11/21/2016.
 */
public class WeaponConverter implements Converter<String, Weapon> {
    @Override
    public Weapon convert(String text) {
        String[] values=text.split(",");

        String name = values[0];
        int hit = Integer.valueOf(values[1]);

        Weapon weapon = new Weapon(name, hit);
        return weapon;
    }
}
