package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ProductDao;
import com.cg.entity.Product;
import com.cg.repository.ProductRepository;

@Service
public class ProductService implements ProductDao {

	@Autowired
	private ProductRepository prepository;
	
	public String addProduct(Product product) {
		prepository.save(product);
		return "Product Added Successfully";
	}

	
	public List<Product> getAllProducts() {
		return prepository.findAll();
	}

	
	public Product findBy(int id) {
		return prepository.findById(id).get();
		
	}

}
