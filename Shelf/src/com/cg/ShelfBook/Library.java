package com.cg.ShelfBook;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Shelf> bookshelf=new ArrayList<>(); 
	
	public void addShelf(Shelf shelf) {
		bookshelf.add(shelf);
	}
	public List<Shelf> getShelf(){
		return bookshelf;
	}
	


}
