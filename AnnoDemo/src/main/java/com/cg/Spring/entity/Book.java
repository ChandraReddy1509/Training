package com.cg.Spring.entity;

public class Book {
	
	protected int bookCode;
	protected String bookName;
	protected String author;
	protected double price;
	
	public Book() {
		super();
	}

	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ "]";
	}

	public Book(int bookCode, String bookName, String author, double price) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	

	}
	

	



