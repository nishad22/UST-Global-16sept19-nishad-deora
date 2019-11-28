package com.ustglobal.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class TestD {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(20);
	al.add(11);
	al.add(33);
	al.add(40);
	al.add(60);
	al.add(22);
	al.add(80);
	Comparator<Integer> cmp = (m1,m2)->{
		if(m1>m2)
			return 1;
		else if(m1<m2)
			return -1;
		else
			return 0;
		};
	long noOfFailStudents = 
			al.stream().filter(i -> i < 40).count();
	System.out.println(noOfFailStudents);
	
	System.out.println("--------------------------");
	Integer i = al.stream().min(cmp).get();
	System.out.println("min value is "+i);
	
	System.out.println("--------------------------");
	Integer j = al.stream().max(cmp).get();
	System.out.println("max value is "+j);
}
}
