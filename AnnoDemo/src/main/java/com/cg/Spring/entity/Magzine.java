package com.cg.Spring.entity;

public class Magzine extends Book {
	private  String catagory;
	public Magzine() {
	}
	

	public Magzine(int bookCode,String bookName,String author,double price) {
		super(bookCode,bookName,author,price);
		this.catagory=catagory;
		
		
	
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	@Override
	public String toString() {
		return "Magzine [catagory=" + catagory + ", bookCode=" + bookCode + ", bookName=" + bookName + ", author="
				+ author + ", price=" + price + "]";
	}
	
	
}
	
	
	

