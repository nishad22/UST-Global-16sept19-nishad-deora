package com.ust.firstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.springcore.di.Animal;
import com.ust.springcore.di.Hello;
import com.ust.springcore.di.Pet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Hello hello = context.getBean(Hello.class);//give sus object to use it
    	System.out.println(hello.getMsg());
    	System.out.println(hello.getMap());
    	Hello hello1 = context.getBean(Hello.class);
    	System.out.println(hello1.getMsg());
    	
    	
//    	System.out.println(hello);
//    	System.out.println(hello1);
    	
    	Animal animal = context.getBean(Animal.class);
    	animal.makeSound();
    	
    	Animal animal1 = (Animal)context.getBean("dog");
    	animal1.makeSound();
    	System.out.println("------------------------------");
    	Pet pet =  context.getBean(Pet.class);
    	System.out.println(pet.getName());
    	pet.getAnimal().makeSound();
    }
}
