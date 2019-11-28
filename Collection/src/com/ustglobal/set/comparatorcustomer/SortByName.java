package com.ustglobal.set.comparatorcustomer;

import java.util.Comparator;

public class SortByName implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		String s = o1.name;
		String s1 = o2.name;
		return s.compareToIgnoreCase(s1);
		
	}
}
