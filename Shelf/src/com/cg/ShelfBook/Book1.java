package com.cg.ShelfBook;

public class Book1 {
	private String BookName;
	private String BookAuthor;
	private String Price;
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public Book1(String bookName, String bookAuthor, String price) {
		super();
		BookName = bookName;
		BookAuthor = bookAuthor;
		Price = price;
	}
	public void Book1(String bookName2, String bookAuthor2, String price2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book1 [BookName=" + BookName + ", BookAuthor=" + BookAuthor + ", Price=" + Price + "]";
	}
	
	

}
