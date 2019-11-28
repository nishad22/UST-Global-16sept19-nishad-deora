package com.ust.firstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.bookconfig.Book;
import com.ust.springcore.config.ConfigurationBook;

public class TestBook {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("beansbook.xml");
		Book book = context.getBean(Book.class);
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getPenName());
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		
		System.out.println("++++++++Annotations+++++++");
		
		ApplicationContext context1 = new AnnotationConfigApplicationContext(ConfigurationBook.class);
		Book book1 = context1.getBean(Book.class);
		System.out.println(book1.getAuthor().getName());
		System.out.println(book1.getAuthor().getPenName());
		System.out.println(book1.getName());
		System.out.println(book1.getPrice());
		System.out.println(book1.getComp().getComname());
		
		
	}
}
