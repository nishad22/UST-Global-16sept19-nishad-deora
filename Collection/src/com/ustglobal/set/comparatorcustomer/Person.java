package com.ustglobal.set.comparatorcustomer;

public class Person   {
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	String name;
	int age;
	int id;

	public Person(String name,int age,int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}


	
	
}
