package com.ustglobal.list;

import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;

public class TestVector {
	public static void main(String[] args) {
		Vector<String> al = new Vector<String>();
		al.add("raj");
		al.add("raja");
		al.add("raju");
		al.add("rani");

		String name = al.get(0);
		System.out.println(name.toUpperCase());
		
		System.out.println("\n------iterator----------");
		Iterator<String>itr= al.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.print(" "+s);
		}
		System.out.println("\n----------ListIterator-----------");
		ListIterator<String> lt = al.listIterator();
		while (lt.hasNext()) {
			String type = lt.next();
			System.out.print(" "+type);
		}
		System.out.println("\n----------FOR Each-----------");
		for(String s : al) {
			System.out.print(" "+s);
		}
		
		System.out.println("\n----------FOR loop-----------");
		for(int i = 0;i<al.size();i++) {
			System.out.print(" "+al.get(i));
		}
		
		System.out.println("\n------hasPrevious----------");
		while(lt.hasPrevious()) {
			String s = lt.previous();
			System.out.print(" "+s);
		}
	}
}
