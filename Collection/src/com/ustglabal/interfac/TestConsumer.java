package com.ustglabal.interfac;

import java.util.function.Consumer;

public class TestConsumer {
	public static void main(String[] args) {
		Consumer<Student> c = s-> {
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.prec);
		};
		Student s1 = new Student(2, "Bhavani", 67.9);
		c.accept(s1);
	}
}
