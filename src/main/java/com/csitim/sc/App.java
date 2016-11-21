package com.csitim.sc;

import com.csitim.sc.model.Character;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by Timea_Csiszar on 11/11/2016.
 */

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        Map<String, Character> characters = context.getBeansOfType(Character.class);
        //Weapon weapon = new Weapon("Ogre's weapon", 50);
        //map(Character::getName).
        characters.values().stream().forEachOrdered(p->logger.info(p.toString()));

        context.registerShutdownHook();
    }
}
