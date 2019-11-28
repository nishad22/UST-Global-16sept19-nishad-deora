package com.ustglobal.list;

import java.util.ArrayList;

public class TestC {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("HELLO");
	
	Object o = al.get(0);
	String s = (String) o;
	
	s = s.toLowerCase();
	System.out.println(s);
}
}
