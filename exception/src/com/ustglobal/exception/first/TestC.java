package com.ustglobal.exception.first;

public class TestC {
public static void main(String[] args) {
	System.out.println("Main Started");
	int a = 10;
	int b = 0;
	int c[] = {10,20,30,50};
	
	try {
		b = a/b;
		System.out.println(b);
		System.out.println("Hello");
	}
	catch(ArithmeticException e) {
		System.out.println("Infinity");
	}
	
	try {
		System.out.println(c[5]);
	}
	catch(ArrayIndexOutOfBoundsException ae){
		System.out.println("Specify element within array length");
	}
	
	System.out.println("Main Ended");
	System.out.println("Happy Diwali");
}
}
