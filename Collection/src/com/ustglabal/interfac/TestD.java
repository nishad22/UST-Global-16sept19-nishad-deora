package com.ustglabal.interfac;

import java.util.function.Function;

public class TestD {
public static void main(String[] args) {
	Function<Integer, Student> f = id->{
		Student s  = new Student(2,"vijay",56.76);
		s.id = id;
		return s;
	};
	Student s = f.apply(26);
	System.out.println(s.id);
	System.err.println(s.name);
	System.out.println(s.prec);
}
}
