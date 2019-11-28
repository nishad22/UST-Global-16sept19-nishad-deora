package com.ustglobal.map.emp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public class TestEmployee {
public static void main(String[] args) {
	
	Employee s1 = new Employee(2,"divya",25000);
	Employee s2 = new Employee(5,"ambika",35000);
	Employee s3 = new Employee(12,"kiran",65000);
	Employee s4 = new Employee(34,"rani",10000.25);
	Employee s5 = new Employee(56,"ayushi",12456.78);
	Employee s6 = new Employee(87,"priya",89458.88);
	Employee s7 = new Employee(21,"priti",20000);
	Employee s8 = new Employee(66,"archu",30000);
	Employee s9 = new Employee(1,"sweety",50000);
	Employee s0 = new Employee(17,"anu",43000);
	
	ArrayList<Employee> al = new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	ArrayList<Employee> al1 = new ArrayList<>();
	al1.add(s4);
	al1.add(s5);
	al1.add(s6);
	
	ArrayList<Employee> al2 = new ArrayList<>();
	al2.add(s7);
	al2.add(s8);
	al2.add(s9);
	al2.add(s0);
	
	HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
	hm.put("manager1", al);
	hm.put("manager2", al1);
	hm.put("manager3", al2);
	
	//System.out.println(hm);
//	for(Map.Entry<String, ArrayList<Employee>> m : hm.entrySet()) {
//		System.out.println("\n"+m);
//	}
	System.out.println("=======Manager one========");
	
	ArrayList<Employee> first = hm.get("manager1");
	
	Iterator<Employee> it =  first.iterator();
	while(it.hasNext()) {
		Employee e = it.next();
		System.out.println("Id is "+e.id);
		System.out.println("Name is "+e.name);
		System.out.println("Salary is "+e.sal);
		
	}
	System.out.println("=======Manager two========");
	Iterator<Employee> it1 = hm.get("manager2").iterator();
	while(it1.hasNext()) {
		Employee e = it1.next();
		System.out.println("Id is "+e.id);
		System.out.println("Name is "+e.name);
		System.out.println("Salary is "+e.sal);
		
	}
	
	System.out.println("=======Manager three========");
	ListIterator<Employee> it2 = hm.get("manager3").listIterator();
	while(it2.hasNext()) {
		Employee e = it2.next();
		System.out.println("Id is "+e.id);
		System.out.println("Name is "+e.name);
		System.out.println("Salary is "+e.sal);
		
	}
	
	
}
}
