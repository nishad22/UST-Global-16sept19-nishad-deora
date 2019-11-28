package com.ustglobal.set.comparator;

import java.util.TreeSet;

public class Employee {
	public static void main(String[] args) {
		Person p1 = new Person("Sahil",30000,22);
		Person p2 = new Person("Raja",4500,2);
		Person p3 = new Person("Chagan",27400,24);
		Person p4 = new Person("Chagan",27400,24);

		SortByName sn  = new SortByName();
		TreeSet<Person> al = new TreeSet<Person>(sn);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		
		System.out.println("----------FOR Each-----------");
		for(Person s : al) {
			System.out.println(" "+s);
		}
		
		

	}
}

