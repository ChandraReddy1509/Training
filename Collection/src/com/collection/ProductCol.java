package com.collection;

public class ProductCol {
	private Integer productCode;
	private String productName;
	private int stock;
	private double price;
	public ProductCol(int productCode, String productName, int stock, double price) {
		//super();
		this.productCode = productCode;
		this.productName = productName;
		this.stock = stock;
		this.price = price;
	}
	public Integer getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
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
public String toString() {
	return productName+productCode+price+stock;
}
public int compareTo(ProductCol p) {
	return this.getProductCode().compareTo(p.productCode);
	
	
}
	
	

}
