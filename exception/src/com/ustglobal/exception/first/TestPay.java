package com.ustglobal.exception.first;

public class TestPay {
public static void main(String[] args) {
	System.out.println("Main Started");
	PayTM p = new PayTM();
	try {
		p.book();
	} catch (ArithmeticException ae) {
		System.out.println("Exception caught in main");
	}
	
	finally {
		System.out.println("all connection are closed");
	}
	System.out.println("Main method");
}
}
