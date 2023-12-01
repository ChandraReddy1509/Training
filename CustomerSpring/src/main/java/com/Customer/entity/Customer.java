package com.Customer.entity;

public class Customer {
	private int code;
	private String name;
	private String address;
	private Product product;
	
	
	public Customer() {
		
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Customer [code=" + code + ", name=" + name + ", address=" + address + ", product=" + product + "]";
	}

	public Customer(int code, String name, String address, Product product) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.product = product;
	}
	
	
}