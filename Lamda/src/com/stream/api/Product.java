package com.stream.api;

import com.collection.ProductCol;

public class Product {
	private Integer productCode1;
	private String productName1;
	private int stock1;
	private double price1;
	public Product(int productCode1, String productName1, int stock1, double price1) {
		//super();
		this.productCode1 = productCode1;
		this.productName1 = productName1;
		this.stock1 = stock1;
		this.price1 = price1;
	

}
	public Integer getProductCode1() {
		return productCode1;
	}
	public void setProductCode1(Integer productCode1) {
		this.productCode1 = productCode1;
	}
	public String getProductName1() {
		return productName1;
	}
	public void setProductName1(String productName1) {
		this.productName1 = productName1;
	}
	public int getStock1() {
		return stock1;
	}
	public void setStock1(int stock1) {
		this.stock1 = stock1;
	}
	public double getPrice1() {
		return price1;
	}
	public void setPrice1(double price1) {
		this.price1 = price1;
	}

public String toString() {
return productName1+productCode1+price1+stock1;
}
public int compareTo(ProductCol p) {
return this.getProductCode1().compareTo(p.getProductCode());
}

}







