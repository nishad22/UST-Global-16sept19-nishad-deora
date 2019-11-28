package com.ustglobal.list.computer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComp {
public static void main(String[] args) {
	Computer c1 = new Computer(40000,23,"dell");
	Computer c2 = new Computer(30000,12,"hp");
	Computer c3 = new Computer(50000,3,"lenovo");
	Computer c4 = new Computer(70000,55,"Asus");
	
	
	ArrayList<Computer> al = new ArrayList<Computer>();
	al.add(c1);
	al.add(c2);
	al.add(c3);
	al.add(c4);
	al.add(new Computer(45000,34,"Mackbook"));
	displayComp(al);
	Collections.sort(al);
	System.out.println("----after sorting------");
	displayComp(al);
}
static void displayComp(ArrayList<Computer> al) {
	Iterator<Computer> it = al.iterator();
	while(it.hasNext()) {
		Computer c = it.next();
		System.out.println(c);
	}
}
}
