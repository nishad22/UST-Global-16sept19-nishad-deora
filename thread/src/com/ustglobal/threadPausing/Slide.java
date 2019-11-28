package com.ustglobal.threadPausing;

public class Slide {
public static void main(String[] args) {
	System.out.println("Main Started");
	for(int i=0;i<5;i++) {
		System.out.println(" Sliding ");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
}
