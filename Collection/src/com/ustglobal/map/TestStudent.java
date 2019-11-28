package com.ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestStudent {
public static void main(String[] args) {
	
	Student s1 = new Student(2,"divya",67.84);
	Student s2 = new Student(5,"ambika",56.67);
	Student s3 = new Student(12,"kiran",45.7);
	Student s4 = new Student(34,"rani",67.84);
	Student s5 = new Student(56,"ayushi",67.84);
	Student s6 = new Student(87,"priya",67.84);
	Student s7 = new Student(21,"priti",67.84);
	Student s8 = new Student(66,"archu",67.84);
	Student s9 = new Student(1,"sweety",67.84);
	Student s0 = new Student(17,"anu",67.84);
	
	ArrayList<Student> al = new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	ArrayList<Student> al1 = new ArrayList<>();
	al1.add(s4);
	al1.add(s5);
	al1.add(s6);
	
	ArrayList<Student> al2 = new ArrayList<>();
	al2.add(s7);
	al2.add(s8);
	al2.add(s9);
	al2.add(s0);
	
	HashMap<String, ArrayList<Student>> hm = new HashMap<>();
	hm.put("first", al);
	hm.put("second", al1);
	hm.put("third", al2);
	
	//System.out.println(hm);
	for(Map.Entry<String, ArrayList<Student>> m : hm.entrySet()) {
		System.out.println("\n"+m);
	}
	System.out.println("====================================");
	
	ArrayList<Student> first = hm.get("second");
	
	Iterator<Student> it =  first.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
}
}
