package com.ustglobal.exception.customizechecked;

public class InvalidAmountException extends Exception{
private String msg = "Amount below 40000";
public String getMessage() {
	return msg;
}
}
