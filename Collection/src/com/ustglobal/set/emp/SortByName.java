package com.ustglobal.set.emp;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {
@Override
public int compare(Employee o1, Employee o2) {
	String s = o1.name;
	String s1 = o2.name;
	return s.compareToIgnoreCase(s1);	
}
}
