package com.usstglobal.thread.join;


public class MyThread extends Thread{

	public void run() {	
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
//			Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}	
	}
	
}