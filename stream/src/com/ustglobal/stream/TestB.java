package com.ustglobal.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(20);
	al.add(11);
	al.add(33);
	al.add(40);
	al.add(60);
	al.add(22);
	al.add(80);
	
	List<Integer> l = al.stream().sorted().collect(Collectors.toList());
	Iterator<Integer> it = l.iterator();
	System.out.println("sorted------->");
	while(it.hasNext()) {
		Integer i = it.next();
		System.out.println(i);
		
	}
}
}
