package com.ustglobal.exception.customizedunchecked;

public class InvalidAgeException extends RuntimeException {
String msg = "Below 18";
// public InvalidAgeException() {
//}

public InvalidAgeException(String msg) {
	this.msg = msg;
}
@Override
public String getMessage() {
	return msg; 
}
//public String toString() {
//	return msg;
//}
}

