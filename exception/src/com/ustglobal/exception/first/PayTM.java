package com.ustglobal.exception.first;

public class PayTM {
public  void book() {
	Irctc i = new Irctc();
	i.confirm();
	
	System.out.println("PayTM ended");
}
}
