package com.ust.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ust.springcore.di.Cat;
import com.ust.springcore.di.Dog;
import com.ust.springcore.di.Pet;

@Configuration
public class PetConfigurationClass {
	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean(name = "cat")
	public Cat getCat() {
		return new Cat();
	}
	@Bean(name="pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Bittu");
//		pet.setAnimal(getDog());
		return pet;
	}
}
