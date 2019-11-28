package com.ustglabal.interfac;

import java.util.function.Predicate;

public class TestPredicate {
public static void main(String[] args) {
	Predicate<Integer> p = i ->{
		if(i%2==0) {
			return true;
		} else
			return false;
	};
	boolean res = p.test(10);
	System.err.println(res);
	
}
}
