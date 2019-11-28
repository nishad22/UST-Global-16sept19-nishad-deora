package com.ustglobal.exception.first;

public class TestA {
public static void main(String[] args) {
	int a[] = {10,20,30,50};
	try {
		System.out.println("Main started");
		
		System.out.println(a[1]);
		System.out.println(a[4]);
	}
	catch(ArrayIndexOutOfBoundsException ae){
		System.out.println("Specify element within array length");
	}
	System.out.println("main ended");
}
}
