package com.ustglobal.map;

public class Student {
	int id;
	String name;
	double perc;
	public Student(int id, String name, double perc) {
		super();
		this.id = id;
		this.name = name;
		this.perc = perc;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", perc=" + perc + "]";
	}
	
}
