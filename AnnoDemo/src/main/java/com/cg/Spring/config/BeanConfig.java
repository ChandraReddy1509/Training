package com.cg.Spring.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.Spring.entity.Book;
import com.cg.Spring.entity.Librarry;
import com.cg.Spring.entity.Magzine;

@Configuration
public class BeanConfig {
	@Bean
	public Magzine magzine() {
		return new Magzine(121212,"abhishek","shek",2323.00);
	}

	@Bean
	public Book book() {
		return new Book(123,"ghfht","fhfg",4464.9);
	}
	@Bean
	public Librarry librarry() {
		return new Librarry(12,"dlanfd","nda",book());
	}
	@Bean
	public List<Book> bookList(){
		 List<Book> bookList=new ArrayList<Book>();
		 bookList.add(new Book(1,"core","raju1",200.0));
		 return bookList;
	}
}

			
			
		
	


