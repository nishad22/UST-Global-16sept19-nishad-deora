package com.ustglobal.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestLinkedMap {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
	lhm.put("Begaluru", 560072);
	lhm.put("Nagpur", 480021);
	lhm.put("Tirora", 441911);
	
	System.out.println(lhm);
	Set<String> s = lhm.keySet();
	for(String key : s) {
		System.out.println("key "+key);
	}
	
	System.out.println("=================");
	Collection<Integer> c = lhm.values();
	for(Integer i : c) {
		System.out.println(i);
	}
}
}
