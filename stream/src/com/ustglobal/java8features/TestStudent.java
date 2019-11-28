package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestStudent {
public static void main(String[] args) {
	Student s1 = new Student(2,"divya",67.84);
	Student s2 = new Student(5,"ambika",56.67);
	Student s3 = new Student(12,"kiran",45.7);
	Student s4 = new Student(34,"rani",30.84);
	Student s5 = new Student(56,"ayushi",29.84);
	Student s6 = new Student(87,"priya",96.84);
	Student s7 = new Student(21,"priti",50.84);
	
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	al.add(s6);
	al.add(s7);
	
	Helper hp = new Helper();
//	hp.displayDetails(al);
//	hp.dispalyFailed(al);
	hp.displayPassed(al);
}
}
