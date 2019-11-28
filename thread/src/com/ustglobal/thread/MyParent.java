package com.ustglobal.thread;

public class MyParent extends Thread{
	public void run() {
		System.out.println("Parent Method");
		try {Thread.sleep(500);}catch(Exception e){e.printStackTrace();}

	}
}
