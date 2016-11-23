package com.csitim.sc;

import com.csitim.sc.model.OgreWeaponFactoryBean;
import com.csitim.sc.model.Weapon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.csitim.sc.model.Character;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Timea_Csiszar on 11/23/2016.
 */
@Configuration
public class AppConfig {

    @Bean
    public Character ogre() throws Exception {
        Character character = new Character("Ogre", 100);
        character.setWeapon(ogreWeaponByFactory().getObject());
        List<Character> associates=new ArrayList<>();
        associates.add(igen());
        associates.add(igen());
        character.setAssociates(associates);
        return character;
    }

    @Bean
    public Character igen(){
        return new Character("Igen", 200);
    }

    @Bean(initMethod = "myInitMethod", destroyMethod = "myDestroyMethod")
    public Weapon weapon(){
        return new Weapon("Ogre's first weapon", 50);
    }

    @Bean
    public Weapon ogreWeapon2(){
        return new Weapon("Ogre's second weapon", 50);
    }

    @Bean
    public OgreWeaponFactoryBean ogreWeaponByFactory(){
        return new OgreWeaponFactoryBean();
    }
}
