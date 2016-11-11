package com.csitim.sc;

import com.csitim.sc.model.Character;
import com.csitim.sc.model.Weapon;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Collections;
import java.util.Map;

/**
 * Created by Timea_Csiszar on 11/11/2016.
 */

public class App {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        Map<String, Character> characters = context.getBeansOfType(Character.class);
        //Weapon weapon = new Weapon("Ogre's weapon", 50);
        characters.values().stream().map(Character::getName).forEach(System.out::println);
    }
}
