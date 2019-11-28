package com.ustglobal.list.Student;

import java.awt.DisplayMode;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestStudent  {
	public static void main(String[] args) {
		LinkedList<Student> ai =  new LinkedList<>();
		
		Student s1 = new Student(101,"Rajpal",75);
		Student s2 = new Student(102,"Navjot",50);
		Student s3 = new Student(103,"Kapil",65.56);
		
		ai.add(s1);
		ai.add(s2);
		ai.add(s3);
		
		System.out.println(ai);
		displayStudentDetails(ai);
		System.out.println("----after sorting----");
		Collections.sort(ai);
		System.out.println(ai);
	}
	static void displayStudentDetails(LinkedList<Student> ai) {
		Iterator<Student> it = ai.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
	}
	
}

