package com.ustglabal.interfac.emp;

import java.util.function.Predicate;

public class TestEmp {
public static void main(String[] args) {
	Predicate<Employee> emp = e ->{
		if(e.sal > 40000) {
			return true;
		} else
			return false;
	};
	
	Employee em = new Employee(1, "Nishad", 30000);
	boolean b = emp.test(em);
	System.out.println(b);
}
}
