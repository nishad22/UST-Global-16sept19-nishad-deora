package com.ustglobal.set.treeemployee;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Employee {
	public static void main(String[] args) {
		Person p1 = new Person("Sahil",30000,22);
		Person p2 = new Person("Raja",4500,2);
		Person p3 = new Person("Chagan",27400,24);
		Person p4 = new Person("Chagan",27400,24);

		TreeSet<Person> al = new TreeSet<Person>();
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

