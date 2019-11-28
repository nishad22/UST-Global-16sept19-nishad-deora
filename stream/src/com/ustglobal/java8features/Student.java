package com.ustglobal.java8features;

public class Student {
	int id;
	String name;
	double prec;
	public Student(int id, String name, double prec) {
		super();
		this.id = id;
		this.name = name;
		this.prec = prec;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", prec=" + prec + "]";
	}

}
