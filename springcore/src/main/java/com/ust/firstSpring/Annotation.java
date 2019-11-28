package com.ust.firstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.springcore.config.HelloConfigurationClass;
import com.ust.springcore.di.Animal;
import com.ust.springcore.di.Hello;
import com.ust.springcore.di.Pet;

public class Annotation {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfigurationClass.class);
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());

		Hello hello2 = context.getBean(Hello.class);
		System.out.println(hello);
		System.out.println(hello2);
		System.out.println("+++++++++++++++++++");
//		Animal animal = context.getBean(Animal.class);
//		animal.makeSound();
		System.out.println("+++++++++++++++++++");
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		System.out.println("+++++++++++++++++++");
		context.close();
	}
}
