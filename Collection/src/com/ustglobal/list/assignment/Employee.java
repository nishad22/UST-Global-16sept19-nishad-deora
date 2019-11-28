package com.ustglobal.list.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Employee {
public static void main(String[] args) {
	Person p1 = new Person("Raj","wipro",22,1);
	Person p2 = new Person("Raja","infosys",23,12);
	Person p3 = new Person("Raju","TCS",24,3);
	
	ArrayList<Person> al = new ArrayList<Person>();
	al.add(p1);
	al.add(p2);
	al.add(p3);
	
	System.out.println("------iterator----------");
	Iterator<Person>itr= al.iterator();
	while(itr.hasNext()) {
		Person s = itr.next();
		System.out.println(" "+s);
	}
	System.out.println("----------ListIterator-----------");
	ListIterator<Person> lt = al.listIterator();
	while (lt.hasNext()) {
		Person type = lt.next();
		System.out.println(" "+type);
	}
	System.out.println("----------FOR Each-----------");
	for(Person s : al) {
		System.out.println(" "+s);
	}
	System.out.println("----------FOR loop-----------");
	for(int i = 0;i<al.size();i++) {
		System.out.println(" "+al.get(i));
	}
	System.out.println("------hasPrevious----------");
	while(lt.hasPrevious()) {
		Person s = lt.previous();
		System.out.println(" "+s);
	}
}
}
