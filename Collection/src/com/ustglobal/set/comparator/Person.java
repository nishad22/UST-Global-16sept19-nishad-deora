package com.ustglobal.set.comparator;

public class Person {
	String name;
	int sal;
	int id;

	public Person(String name,int sal,int id) {
		this.name = name;
		this.sal = sal;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sal=" + sal + ", id=" + id + "]";
	}
}
