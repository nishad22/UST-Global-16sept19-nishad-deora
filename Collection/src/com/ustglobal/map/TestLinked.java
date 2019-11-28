package com.ustglobal.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinked {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("Begaluru", 560072);
		lhm.put("Nagpur", 480021);
		lhm.put("Tirora", 441911);
		
		for(Map.Entry<String, Integer> m : lhm.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is "+key+" "+"value "+value);
		}
	}

}
