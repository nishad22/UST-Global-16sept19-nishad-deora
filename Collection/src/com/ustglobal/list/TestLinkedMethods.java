package com.ustglobal.list;

import java.util.LinkedList;

public class TestLinkedMethods {
public static void main(String[] args) {
	LinkedList<Integer> ld = new LinkedList<>();
	ld.add(1);
	ld.add(4);
	ld.add(2);
	ld.add(5);
	ld.add(7);
	ld.add(new Integer(14));
	
	System.out.println(ld);
	
	Integer peek = ld.peek();
	System.out.println("PeekElement"+" "+peek);
	
	Integer peekFirst = ld.peekFirst();
	System.out.println("PeekFirstElement"+" "+peekFirst);
	
	Integer peekLast = ld.peekLast();
	System.out.println("PeekLastElement"+" "+peekLast);
	
	Integer poll = ld.poll();
	System.out.println("pollElement"+" "+poll);
	
	System.out.println("PollFirstElement"+" "+ld.pollFirst());
	
	System.out.println("PollLastElement"+" "+ld.pollLast());
	
	System.out.println(ld);
	System.out.println("-------after push-------");
	ld.push(12);
	System.out.println(ld);
	System.out.println("-------after pop-------");
	ld.pop();
	System.out.println(ld);
}
}
