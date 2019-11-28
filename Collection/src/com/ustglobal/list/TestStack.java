package com.ustglobal.list;

import java.util.Stack;

public class TestStack {
public static void main(String[] args) {
	Stack<Integer> st = new Stack<Integer>();
	st.add(12);
	st.add(14);
	st.add(1);
	
	System.out.println("using get()");
	for(int i = 0;i<st.size();i++) {
		System.out.println(st.get(i));
	}
	int j = st.size();
	System.out.println("using pop()");
	for (int i = 0; i < j; i++) {
		System.out.println(st.pop());
	}
}
}
