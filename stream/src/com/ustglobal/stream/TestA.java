package com.ustglobal.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(11);
		al.add(33);
		al.add(40);
		al.add(60);
		al.add(77);
		al.add(80);
		List<Integer> l =
				al.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(l);


	}
}
