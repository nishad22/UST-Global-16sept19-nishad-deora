package com.ust.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ust.bookconfig.Author;
import com.ust.bookconfig.Book;
import com.ust.bookconfig.Company;
@Configuration
public class ConfigurationBook {
	
	@Bean(name="book")
	public Book getBook() {
		Book book = new Book();
		book.setName("JAVA");
		book.setPrice(2000.67);
		return book;
	}
	
	@Bean(name = "author")
	public Author getAuthor() {
		Author auth = new Author();
		auth.setName("Nishad");
		auth.setPenName("Cello");
		return auth;
	}
	@Bean(name = "company")
	public Company getCompany() {
		Company c = new Company();
		c.setComname("ABC");
		return c;
	}
}
