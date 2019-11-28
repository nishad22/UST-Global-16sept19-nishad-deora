package com.ustglobal.map;

import java.util.HashMap;

public class TestMap {
public static void main(String[] args) {
	HashMap hm = new HashMap();
	hm.put("kuku", 999990);
	hm.put("mala", 899906);
	hm.put("Sheela", 777790);
	hm.put("null", null);
	hm.put("mala", null);
	
	System.out.println(hm);
	
	System.out.println("Value of phone get(): "+ hm.get("Sheela"));
	hm.put("dimple", 986547);
	System.out.println(hm);
	System.out.println("remove()" + hm.remove("kuku"));
	System.out.println(hm);
}
}
