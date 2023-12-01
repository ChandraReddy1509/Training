package com.cg.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ProductService.ProductService;
import com.cg.entity.Product;

@RestController
@RequestMapping("/productapi")
public class ProductController {
	
	@Autowired
	private ProductService service;
	@PostMapping("/")
	public String addProduct(@RequestBody Product product) {
		
		return service.addProduct(product);
	}
	@GetMapping("/")
		public Product getById(@RequestBody Product id ) {
		return null;
	}
		
	@DeleteMapping("/remove")
	public String removeProduct(@RequestBody Product id) {
		return service.removeProduct(id);
		
	}
	@GetMapping("/remove")
	public List<Product> getAll(){
	return service.getAllProducts();
	
	

}
}

