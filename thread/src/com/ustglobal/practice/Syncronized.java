package com.ustglobal.practice;

public class Syncronized {
	int c=;
	public  void count1() {
		c++;
	}
	public  void count2() {
		c--;
	}
	public  int ret() {
		return c;
	}
	public static void main(String[] args) {
		Syncronized s = new Syncronized();
		int b = s.ret();
		System.out.println(b);
	}
}
