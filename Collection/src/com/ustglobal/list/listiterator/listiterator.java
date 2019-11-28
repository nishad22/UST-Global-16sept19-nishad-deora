package com.ustglobal.list.listiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class listiterator {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(45.6);
		al.add(null);
		al.add(null);
		ListIterator li = al.listIterator();
		System.out.println("--------->forward");
		while(li.hasNext()) {
			Object o = li.next();
			System.out.println(o);
		}
		System.out.println("<---------backward");
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}
	}
}
