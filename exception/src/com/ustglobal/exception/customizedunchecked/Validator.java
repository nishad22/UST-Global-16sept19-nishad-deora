package com.ustglobal.exception.customizedunchecked;

public class Validator {


void verify(int age) {
	if(age < 18) {
		throw new InvalidAgeException("you are under 18");
	}
	else
		System.out.println(age);
}
}
