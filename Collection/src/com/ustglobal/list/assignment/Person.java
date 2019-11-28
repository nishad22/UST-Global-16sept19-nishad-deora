package com.ustglobal.list.assignment;

public class Person {
	String name;
	int age;
	String prof;
	int id;
	String company;
	public Person(String name,String company,int age,int id) {
		this.name = name;
		this.company = company;
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", id=" + id + ", company=" + company + "]";
	}
	
}
