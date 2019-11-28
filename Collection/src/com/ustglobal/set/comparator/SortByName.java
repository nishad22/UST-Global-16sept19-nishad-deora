package com.ustglobal.set.comparator;

import java.util.Comparator;

public class SortByName implements Comparator<Person>{
 @Override
public int compare(Person p1, Person p2) {
	String  p = p1.name;
	String q = p2.name;
	return p.compareToIgnoreCase(q);
}
}
