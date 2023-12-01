package com.cg.ShelfBook;

import java.util.ArrayList;

import java.util.List;

public class Shelf {
	private List<Book1> books=new ArrayList<>();
	
	public void addBook(Book1 book) {
		if(books.size()< 5) {
			books.add(book);
		}
		
	}
	public List<Book1> getBook1(){
		return books;
		
	}
}
