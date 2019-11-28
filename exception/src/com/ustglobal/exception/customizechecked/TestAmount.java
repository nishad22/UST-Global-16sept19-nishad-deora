package com.ustglobal.exception.customizechecked;

public class TestAmount {
public static void main(String[] args) {
	System.out.println("Main Started");
	 ValidateAmount va = new ValidateAmount();
	 try {
		va.checkAmount(20000);
	} catch (InvalidAmountException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		System.err.println(e.getMessage());
		System.out.println(e.getMessage());
	}
	 
	 System.out.println("Main method");
}
}
