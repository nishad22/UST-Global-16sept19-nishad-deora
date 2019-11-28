package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmp {
public static void main(String[] args) {
	ArrayList<Employee> al = new ArrayList<>();
	Employee e1 = new Employee(4,"niki",5.6);
	Employee e2 = new Employee(1,"basker",5.2);
	Employee e3 = new Employee(5,"suresh",5.1);
	Employee e4 = new Employee(2,"dinesh",4.5);
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	

	Comparator<Employee> cmp = (e5,e6) ->{
		return e5.name.compareTo(e6.name);
	};
	List<Employee> emp = al.stream().sorted(cmp).collect(Collectors.toList());
	Iterator<Employee> it = al.iterator();
	while(it.hasNext()) {
		Employee e = it.next();
		System.out.println("Id is "+e.id);
		System.out.println("Height is "+e.height);
		System.out.println("Name is "+e.name);
		System.err.println("==================");
	}
}
}
