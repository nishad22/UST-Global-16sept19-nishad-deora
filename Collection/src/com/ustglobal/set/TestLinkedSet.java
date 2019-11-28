package com.ustglobal.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestLinkedSet {
public static void main(String[] args) {
	LinkedHashSet<String>  lhs = new LinkedHashSet<String>();
	lhs.add("Raja");
	lhs.add("Raj");
	lhs.add("Nishad");
	lhs.add("Sridhar");
	lhs.add("12");
	lhs.add("13");
	lhs.add("1");
	System.out.println(lhs);
	
	HashSet<Object> hs = new HashSet<>();
	hs.add(null);
	hs.add(12);
	hs.add(1);
	hs.add(50);
	hs.add(2);
	hs.add('A');
	hs.add(13);
	hs.add(69);
	System.out.println(hs);
}
}
