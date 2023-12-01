package com.cg.dao;

import java.util.List;

import com.cg.entity.Product;

public interface ProductDao {
	
	public String addProduct(Product product);
	public List<Product> getAllProducts();
	public Product findBy(int id);
	public String deleteProduct(int id);
	//public String updateProduct(int id,double price);
	public String upadteProduct(Product product);
	
	public Product getByProductName(String productName);
	
	public List<Product> getProductByStock(int stk );
	

}
