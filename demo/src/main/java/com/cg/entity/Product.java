package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="pname")
	private String productName;
	
	@Column(name="stock")
	private  int stock;
	
	@Column(name="price")
	private double price;
	
	public Product() {
		
	}
	
	public Product(int id, String productName, int stock, double price) {
		super();
		this.id = id;
		this.productName = productName;
		this.stock = stock;
		this.price = price;
	}
	
	

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
	
	
	

}


