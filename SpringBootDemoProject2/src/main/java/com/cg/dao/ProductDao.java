package com.cg.dao;

import java.util.List;

import com.cg.entity.Product;

public interface ProductDao {
	
	public String addProduct(Product product);
	public List<Product> getAllProducts();
	public Product getById(int Id);
	public void deleteProduct(int productId);
	}


