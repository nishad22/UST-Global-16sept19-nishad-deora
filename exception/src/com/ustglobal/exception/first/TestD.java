package com.ustglobal.exception.first;

public class TestD {
	public static void main(String[] args) {
		String s = "hello";
		int[] a = {10,20,30};
		int b =10;
		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			
		}
		
		catch(NullPointerException npe) {
			System.out.println("dont play with null");
		}
		try {
			System.out.println(a[2]);
		}
		catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
			System.out.println("index not present");
		}
		try {
			System.out.println(b/0);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
//			System.out.println("In/finity");
		}
	}
 
 
		
	
}
