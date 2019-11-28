package com.ustglobal.map;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap<String, Integer> lhm = new TreeMap<>();
		lhm.put("Begaluru", 560072);
		lhm.put("Amritsar", 480021);
		lhm.put("Tirora", 441911);
		lhm.put("null", 23);
		lhm.put("null", null);
//		System.out.println(lhm);
for(Map.Entry<String, Integer> m : lhm.entrySet()) {		
	String key = m.getKey();
	Integer value = m.getValue();
	System.out.println("key is "+key+" "+"value "+value);
}
	}
}
