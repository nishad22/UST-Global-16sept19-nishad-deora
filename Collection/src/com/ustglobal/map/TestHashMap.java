package com.ustglobal.map;

import java.util.HashMap;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku", 999990);
		hm.put("mala", 899906);
		hm.put("Sheela", 777790);
		hm.put("kuku",1);
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu", 466545);
		hm1.put("riya", 589545);
		hm1.put("kriti", 467767);
		
		boolean hasKey = hm.containsKey("bala");
		System.out.println("has key "+hasKey);
		
		boolean hasValue = hm1.containsValue("466545");
		System.out.println("has value "+hasValue);
		
		hm.putAll(hm1);
		System.out.println(hm);
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty "+isEmpty);
		
		hm1.clear();
		System.out.println("After clear "+hm1);
	}		
}
