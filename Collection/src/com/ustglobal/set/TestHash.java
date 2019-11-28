package com.ustglobal.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestHash {
public static void main(String[] args) {
	HashSet<Object> hs = new HashSet<>();
	hs.add(12);
	hs.add(null);
	hs.add("Nishad");
	hs.add("");
	hs.add(null);
	hs.add(13);
	hs.add(1);
	
	System.out.println(hs);
	
	Iterator<Object> it = hs.iterator();
	while(it.hasNext()) {
		Object o = it.next();
		System.out.println(o);
	}
}
}
