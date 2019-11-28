package com.ustglobal.exception.customizedunchecked;

public class TestAge {
public static void main(String[] args) {
	System.out.println("Main Started");
	Validator v = new Validator();
//	try {
//		v.verify(16);
//	}catch(InvalidAgeException ie) {
//		System.out.println("exception");
//	}
	v.verify(17);
}
}
