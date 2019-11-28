package com.ustglabal.interfac;

import java.util.function.Supplier;

public class TestSupplier {
	public static void main(String[] args) {
		Supplier<Student> s = () ->new Student(2,"ajay",65.6);

		Student s1 = s.get();
		System.err.println(s1.id);
		System.err.println(s1.name);
		System.err.println(s1.prec);

		Supplier<Integer> i = () -> 20;
		int val = i.get();
		System.err.println(val);

		Supplier<String> sp = ()->"Good Morning";
		String v= sp.get();
		System.err.println(v);
	}

}
