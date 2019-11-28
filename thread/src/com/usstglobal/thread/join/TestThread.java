package com.usstglobal.thread.join;

public class TestThread {
	public static void main(String[] args) {
		System.err.println("Main started");
		MyThread mt = new MyThread();
		mt.start();
		try {
			mt.join(5000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
		System.err.println("Main ended");
		
	}
}
