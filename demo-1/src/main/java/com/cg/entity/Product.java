package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="pname")
	@NotBlank(message="Name cant be blank")
	private String productName;
	
	@Column(name="stock")
	@Min(value=5,message="Stock cannot be below 5")
	private  int stock;
	
	@Column(name="price")
	@Min(value=5000,message="min 5000 price is Expected")
	@Max(value=90000,message="Price should be below 90000")
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


