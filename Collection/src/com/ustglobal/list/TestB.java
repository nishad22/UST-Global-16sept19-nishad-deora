package com.ustglobal.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestB {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(null);
	al.add(null);
	al.add(null);
	al.add(null);
	al.add(null);
	al.add("tea");
	al.add(null);
	
	System.out.println(al.get(5));
//	for (int i = 0; i < al.size(); i++) {
//		Object o = al.get(i);
//		System.out.println(o);
//	}
	Iterator itr = al.iterator();
	while(itr.hasNext()) {
		Object o = itr.next();
		System.out.print(o+" ");
	}
	System.out.println();
	Iterator itr1 = al.iterator();
	Object o = itr1.next();
	System.out.println(o+"dds");
	System.out.println("========================");
	ArrayList a = new ArrayList();
	a.add(12);
	a.add("hello");
	a.add(22.98);
	a.add('A');
	a.add(true);
	a.add("tea");
	a.add(null);
	
	System.out.println("=========for loop==========");
	Iterator i = a.iterator();
	for(;i.hasNext();) {
		Object o1 = i.next();
		System.out.println(o1);
	}

	
}

}
