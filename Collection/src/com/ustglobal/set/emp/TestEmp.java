package com.ustglobal.set.emp;

import java.util.Comparator;
import java.util.TreeSet;

public class TestEmp {
public static void main(String[] args) {
	
	Comparator<Employee> comp = (e1,e2) -> {
//		String s1 = e1.name;
//		String s2 = e2.name;
//		return s1.compareToIgnoreCase(s2);
		
		if(e1.height > e2.height) {
			return 1;
		} else if(e1.height < e2.height) {
			return -1;
		} else {
			return 0;
		}
	};
	TreeSet<Employee> ts = new TreeSet<Employee>(comp);
	Employee e1 = new Employee(4,"niki",5.6);
	Employee e2 = new Employee(1,"basker",5.2);
	Employee e3 = new Employee(5,"suresh",5.1);
	Employee e4 = new Employee(2,"dinesh",4.5);
	
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);
	
	for(Employee e : ts) {
		System.out.println(e);
	}
}
}
