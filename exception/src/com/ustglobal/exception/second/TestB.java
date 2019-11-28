package com.ustglobal.exception.second;

public class TestB {
public static void main(String[] args) {
	System.out.println("Main started");
	FileTest ft =new FileTest();
	try {
		ft.open();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("main ended");
}
}
