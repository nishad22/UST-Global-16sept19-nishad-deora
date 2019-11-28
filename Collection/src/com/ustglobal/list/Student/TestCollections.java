package com.ustglobal.list.Student;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestCollections {
public static void main(String[] args) {
	LinkedList<Integer> l= new LinkedList<>();
	l.add(1);
	l.add(2);
	l.add(6);
//	l.add("Nishad");
//	l.add('A');
//	l.add('f');
//	l.add('2');
//	//l.add(null);
//	l.add("Raj");
	l.add(2339);
	l.add(87);
	System.out.println(l);
	
	System.out.println("-------Sort-------");
	Collections.sort(l);
	System.out.println(l);
}
}





//Collections.sort();

//Student s[] = {s1,s2,s3,null};
//System.out.println(s);
//for(Student st : s) {
//	System.out.println(st);
//}
