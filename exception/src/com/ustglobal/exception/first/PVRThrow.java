package com.ustglobal.exception.first;

public class PVRThrow {
public void book(){
	try { 
	System.out.println(10/0);
	System.out.println("login");
	System.out.println("booking confirmed");
	}
	catch(ArithmeticException ae) {
		System.out.println("booking failed");
		throw ae;
	}
	}
}
