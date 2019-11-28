package com.ustglobal.map;

import java.util.Hashtable;

public class TestHashTable {
public static void main(String[] args) {
	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	ht.put(101,"ajay");
	ht.put(102,"vijay");
	ht.put(100,"sonu");
	ht.put(99,"monu");
	//ht.put(12,null); //NullPointerException for value
//	ht.put(null,"null ");//NullPointerException for key
	System.out.println(ht);
}
}
