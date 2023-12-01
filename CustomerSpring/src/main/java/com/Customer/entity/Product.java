package com.Customer.entity;

public class Product {
	
	private int pcode;
	private String pname;
	private int stock;
	private double price ;
	
	public Product() {
		
	}

	public int getPcode() {
		return pcode;
	}

	public void setPcode(int pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", pname=" + pname + ", stock=" + stock + ", price=" + price + "]";
	}

	public Product(int pcode, String pname, int stock, double price) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.stock = stock;
		this.price = price;
	}
	
}
