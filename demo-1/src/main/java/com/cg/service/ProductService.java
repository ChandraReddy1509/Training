package com.cg.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ProductDao;
import com.cg.entity.Product;
import com.cg.exception.EmptyTableException;
import com.cg.exception.ProductNotFoundException;
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
		List<Product> plist=prepository.findAll();
		
		if(plist.size()==0) {
			throw new EmptyTableException("Table is empty");
		}
			return plist;
		
	
	}
	
	public Product findBy(int id) {
		//Product product = prepository.findById(id).get();
		if(prepository.existsById(id)) {
			throw new ProductNotFoundException("Product not found");
		}
		Product product = prepository.findById(id).get();
		return product;
}


	@Override
	public String deleteProduct(int id) {

		 prepository.deleteById(id);
		 return"removedddd";
	}


	
//	public String updateProduct(int id, double price) {
//		findBy(id).setPrice(price);
//		prepository.save(findBy(id));
//		return "updates";
//	}


	
	public String upadteProduct(Product product) {
		Product p = prepository.findById(product.getId()).get();
		
		
		p.setProductName(p.getProductName());
		p.setPrice(p.getPrice());
		p.setStock(p.getStock());
		
		prepository.save(product);
		
		return "product updated";
	}
//
//	public Product getByName(String pname ) {
//		Product p=prepository.findByProductName(pname);
//		return p;
//	}


	
	
	public Product getByProductName(String productName) {
		Product p=prepository.findByProductName(productName);
		return p;
	}


	
	


	
	public List<Product> getProductByStock(int stk) {
		
		return prepository.findByStock(stk);
	}
	}


















