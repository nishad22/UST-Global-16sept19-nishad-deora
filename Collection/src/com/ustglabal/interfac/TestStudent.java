package com.ustglabal.interfac;

import java.util.function.Predicate;

public class TestStudent {
public static void main(String[] args) {
	Predicate<Student> p = s ->{
		if(s.prec >= 35) {
			return true;
		} else
			return false;
	};
	
	Student s = new Student(1,"anup",45.6);
	boolean b = p.test(s);
	System.out.println(b);
}
}
