package com.ustglobal.set.employee;

import java.util.HashSet;
import java.util.Iterator;

public class Employee {
	public static void main(String[] args) {
		Person p1 = new Person("Sahil",30000,22);
		Person p2 = new Person("Raja",4500,2);
		Person p3 = new Person("Chagan",27400,24);
		Person p4 = new Person("Chagan",27400,24);

		HashSet<Person> al = new HashSet<Person>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);

		System.out.println("------iterator----------");
		Iterator<Person>itr= al.iterator();
		while(itr.hasNext()) {
			Person s = itr.next();
			System.out.println(" "+s);
		}
		
		System.out.println("----------FOR Each-----------");
		for(Person s : al) {
			System.out.println(" "+s);
		}


	}
}

