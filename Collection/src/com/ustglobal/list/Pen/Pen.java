package com.ustglobal.list.Pen;

public class Pen implements Comparable<Pen> {
	
	double price;
	String brand;
	String color;
	public Pen(double price, String brand,String color) {
		super();
		this.price = price;
		this.brand = brand;
	}
	
	public Pen(double price, String color) {
		this.price = price;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Pen [price=" + price + ", brand=" + brand + ", color=" + color + "]";
	}
	
	@Override
	public int compareTo(Pen p) {
		if(this.price > p.price)
			return 1;
		else if(this.price < p.price) {
			return -1;
		}
		else
			return 0;
	}

}
