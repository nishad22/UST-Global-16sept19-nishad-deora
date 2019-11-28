package com.ustglobal.list.Pen;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestPen {
	public static void main(String[] args) {
		Pen p1 = new Pen(10,"Cello");
		Pen p2 = new Pen(20,"Reynolds");
		Pen p3 = new Pen(30,"Brighter");

		LinkedList<Pen> ld = new LinkedList<Pen>();
		ld.add(p1);
		ld.add(p2);
		ld.add(p1);
		System.out.println("------after sorting-------");
		Collections.sort(ld);
		displayPen(ld);
		
	}
	static void displayPen(LinkedList<Pen> ld) { 
		Iterator it = ld.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
			
		}
	}
}