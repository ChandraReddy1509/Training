package com.cg.Spring.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Librarry {
	
	private int regno;
	private String lname;
	private String location;
	private Book book;
	@Autowired
	List<Book> bookList;

	
	public  Librarry() {
		
	}


	public int getRegno() {
		return regno;
	}


	public void setRegno(int regno) {
		this.regno = regno;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	@Override
	public String toString() {
		return "Library [regno=" + regno + ", lname=" + lname + ", location=" + location + ", book=" + book + "]";
	}


	public Librarry(int regno, String lname, String location, Book book) {
		super();
		this.regno = regno;
		this.lname = lname;
		this.location = location;
		this.book = book;
	}
	
}


