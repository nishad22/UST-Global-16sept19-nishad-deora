package com.ustglobal.map.emp;

public class Employee {
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
