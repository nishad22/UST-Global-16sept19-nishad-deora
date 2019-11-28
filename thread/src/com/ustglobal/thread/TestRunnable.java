package com.ustglobal.thread;

public class TestRunnable extends Thread implements Runnable{
	public static void main(String[] args) {
		System.out.println("Main Started");
		MyRunnable mr = new MyRunnable();
		//	mr.start(); its is unfined without Thread

		Thread t = new Thread(mr);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.err.println("main Runnable");
		}

	}
}
