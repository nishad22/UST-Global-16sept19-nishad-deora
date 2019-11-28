package com.ust.firstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.springcore.config.ComponentScanConfig;
import com.ust.springcore.di.Hello;
import com.ust.springcore.di.Pet;

public class XMLComponentScanApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("Hello World");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("Sunny");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		System.out.println("----------------------------");
		
		ApplicationContext anno = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
		Hello h1 = context.getBean(Hello.class);
		h1.setMsg("Hello Nishad");
		System.out.println(h1.getMsg());
		
		Pet p = context.getBean(Pet.class);
		p.setName("Huskey");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}
}
