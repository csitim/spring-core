package com.csitim.sc;

import com.csitim.sc.model.Character;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by Timea_Csiszar on 11/11/2016.
 */

public class App {

    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        Map<String, Character> characters = context.getBeansOfType(Character.class);
        //Weapon weapon = new Weapon("Ogre's weapon", 50);
        //map(Character::getName).
        characters.values().stream().forEachOrdered(System.out::println);

        context.registerShutdownHook();
    }
}
