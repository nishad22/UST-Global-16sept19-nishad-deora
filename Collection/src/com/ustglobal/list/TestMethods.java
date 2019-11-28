package com.ustglobal.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestMethods {
public static void main(String[] args) {
	ArrayList<Double> al =  new ArrayList<>();
	al.add(1.0);
	al.add(2.0);
	al.add(2.1);
	al.add(334.32);
	al.add(55.2121);
	al.add(null);
	al.add(null);
	
	System.out.println(al);
//	Iterator itr = al.iterator();
//	while(itr.hasNext()) {
//	Object d = itr.next();
//	System.out.println(d);
//	}
	System.out.println("-------add-------");
	al.add(2,3.4);
	System.out.println(al);
	
	System.out.println("------remove-----");
	al.remove(0);
	System.out.println(al);
	
	
	
	System.out.println("-------get--------");
	Object o = al.get(3);
	System.out.println(o);
	
	System.out.println("-------set--------");
	al.set(2, 4.4);
	System.out.println(al);
	
	ArrayList<Double> a =  new ArrayList<>();
	System.out.println("-------clear-------");
	a.addAll(al);
	System.out.println(a);
	System.out.println("------after clear------");
	//a.clear();
	a.remove(2);
	System.out.println(a);
	
	System.out.println("-------contains---------");
	boolean b = al.contains(334.32);
	System.out.println(b);
	System.out.println("al"+" "+al);
	System.out.println("a"+" "+a);
	
	b = a.containsAll(al);
	
	System.out.println(b);
	
}

}
