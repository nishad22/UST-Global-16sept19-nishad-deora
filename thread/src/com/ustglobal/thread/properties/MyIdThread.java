package com.ustglobal.thread.properties;

public class MyIdThread extends Thread{
public static void main(String[] args) {
	System.out.println("Main Started");
	System.out.println("my thred id:  "+Thread.currentThread().getId());
	
	MyIdThread mi = new MyIdThread();
	System.out.println("myid thread "+mi.getId());
	System.err.println("mtthread alive "+mi.isAlive());
	
	System.out.println("priority "+Thread.currentThread().getPriority());
//	Thread.currentThread().setPriority(16); IllegalArgumentException
	
	System.out.println("Main ended");
}
}
