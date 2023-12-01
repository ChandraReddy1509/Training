package com.cg.entity;

public class Product {
	private int id;
	private String productName;
	private  int stock;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
		return "Product [id=" + id + ", productName=" + productName + ", stock=" + stock + ", price=" + price + "]";
	}
	public Product(int id, String productName, int stock, double price) {
		super();
		this.id = id;
		this.productName = productName;
		this.stock = stock;
		this.price = price;
	}
	
	
	

}
