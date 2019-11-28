package com.ustglobal.set.comparatorcustomer;

import java.util.TreeSet;


public class Customer {
public static void main(String[] args) {
	Person p1 = new Person("Sahil",67,22);
	Person p2 = new Person("Raja",12,2);
	Person p3 = new Person("Chagan",24,24);
	Person p4 = new Person("Magan",43,24);
	SortByName sn = new SortByName();
	TreeSet<Person> hs = new TreeSet<Person>(sn);
	
	hs.add(p1);
	hs.add(p2);
	hs.add(p3);
	hs.add(p4);
	System.out.println(hs);
	}
}
