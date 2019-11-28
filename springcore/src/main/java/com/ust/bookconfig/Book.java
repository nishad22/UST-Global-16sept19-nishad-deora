package com.ust.bookconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Book {
	@Autowired
	@Qualifier("author")
	private Author author;
	private String name;
	private double price;
	@Autowired
	@Qualifier("company")
	private Company comp;
	
	
	public Company getComp() {
		return comp;
	}
	public void setComp(Company comp) {
		this.comp = comp;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
