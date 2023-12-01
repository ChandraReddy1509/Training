package com.cg.ProductService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.dao.ProductDao;
import com.cg.entity.Product;
@Service
public class ProductService implements ProductDao {

	List<Product> productList=new ArrayList<>();


	public String addProduct(@RequestBody Product product) {
		productList.add(product);
		return "addedddd";
	}

	public List<Product> getAllProducts() {
		return productList;
	}

	
//	public String removeProduct(Product id) {
//		productList.remove(id);
//		return "removed";
	
	public void deleteProduct(int productId) {
		Product product =getById(productId);
	}

	@Override
	public Product getById(int Id) {
		// TODO Auto-generated method stub
		return getById(Id);
	}

	public String removeProduct(Product id) {
		// TODO Auto-generated method stub
		return removeProduct(id);
	}
		
}
	
	
	