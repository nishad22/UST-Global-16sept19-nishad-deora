package com.ustglobal.list.Pen;

import java.util.Comparator;

public class ComparePrice implements Comparator<Pen>{
//public int compare()
@Override
public int compare(Pen m1, Pen m2) {
	if(m1.price > m2.price) {
		return 1;
	}
	else if(m1.price < m2.price) {
		return -1;
		
	}
	else
		return 0;
}
}
