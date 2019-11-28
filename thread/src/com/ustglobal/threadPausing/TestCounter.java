package com.ustglobal.threadPausing;

public class TestCounter {
public static void main(String[] args) {
	Counter c = new Counter();
	Runnable r1 = ()->{
		c.increament();
		c.show();
	};
	
	Runnable r2 = ()->{
		c.decreament();
		c.show();
	};
	
	Thread t = new Thread(r1);
	Thread t1 = new Thread(r2);
	t.start();
	t1.start();
}
}
