
package com.ustglobal.list.computer;

public class Computer implements Comparable<Computer>{
int price;
int quanlity;
String brand;
public Computer(int price, int quality, String brand) {
	super();
	this.price = price;
	this.quanlity = quality;
	this.brand = brand;
}
@Override
public String toString() {
	return "Computer [price=" + price + ", quanlity=" + quanlity + ", brand=" + brand + "]";
}
@Override
public int compareTo(Computer c){
	if(this.brand.equalsIgnoreCase(c.brand)) {
		return 1;
	}else if(this.price < c.price) {
		return -1;
	}else
		return 0;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	result = prime * result + price;
	result = prime * result + quanlity;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Computer other = (Computer) obj;
	if (brand == null) {
		if (other.brand != null)
			return false;
	} else if (!brand.equals(other.brand))
		return false;
	if (price != other.price)
		return false;
	if (quanlity != other.quanlity)
		return false;
	return true;
}
}
