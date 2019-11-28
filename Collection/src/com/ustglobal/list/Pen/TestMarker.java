package com.ustglobal.list.Pen;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestMarker {
public static void main(String[] args) {
	Pen p1 = new Pen(30,"red");
	Pen p2 = new Pen(280,"blue");
	Pen p3 = new Pen(23,"black");
	
	LinkedList<Pen> ld = new LinkedList<Pen>();
	ld.add(p1);
	ld.add(p2);
	ld.add(p3);
	ComparePrice cp = new ComparePrice();
	System.out.println("------after sorting-------");
	Collections.sort(ld,cp);
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