package com.ust.springcore.di;

public class Human implements Animal{
	@Override
	public void makeSound() {
		System.out.println("Speaks Hindi");	
	}
}
