package com.ustglobal.thread.properties;

public class MyPriorityThread  extends Thread{
public static void main(String[] args) {
	System.out.println("Main Started");
	int p = Thread.currentThread().getPriority();
	System.err.println("main thread priority "+p);
	
//	System.err.println("main thread priority "+p);
	
	Thread.currentThread().setPriority(7);
	System.err.println("main thread priority "+Thread.currentThread().getPriority());
	
	MyPriorityThread t = new MyPriorityThread();
	int q = t.getPriority();
	
	System.err.println("mypriority thread priority "+q);

	t.setPriority(6);
	System.err.println("mypriority thread priority "+t.getPriority());
	System.out.println("Main ended");
}
}
