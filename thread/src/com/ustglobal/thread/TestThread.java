package com.ustglobal.thread;

public class TestThread {
	public static void main(String[] args) {
		System.err.println("Main started");
		MyThread mt = new MyThread();
		MyParent mp = new MyParent();
		mt.start();
		mp.start();
//		System.err.println("is thread alive "+mt.isAlive());
//		System.err.println("Main ended");
		
	}
}
