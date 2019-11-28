package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
void displayDetails(ArrayList<Student> al) {
	Iterator<Student> it = al.iterator();
	while(it.hasNext()) {
		Student s = it.next();
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("percentage is "+s.prec);
		System.out.println("===========================");
	}
}

void dispalyFailed(ArrayList<Student> al) {
	List<Student> l =
	al.stream().filter(student -> student.prec < 40).collect(Collectors.toList());
	
	Iterator<Student> it = l.iterator();
	while(it.hasNext()) {
		Student s = it.next();
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("percentage is "+s.prec);
		System.out.println("===========================");
	}
	
}

void displayPassed(ArrayList<Student> al) {
	Comparator<Student> cmp = (s1,s2) ->{
		if(s1.prec > s2.prec)
			return 1;
		else if(s1.prec < s2.prec) 
			return -1;
		else
			return 0;
	};
	
	Student s = al.stream().max(cmp).get();
	System.out.println(s);
}
}
