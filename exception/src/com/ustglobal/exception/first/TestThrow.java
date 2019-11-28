package com.ustglobal.exception.first;

public class TestThrow {
public static void main(String[] args) {
	System.out.println("bms started");
	PVRThrow pt = new PVRThrow();
	try {
		pt.book();
		System.out.println("booking confirmed");
	}
	catch(ArithmeticException ae){
		System.out.println("Booking Failed");
	}
	System.out.println("bms ended");
}
}
