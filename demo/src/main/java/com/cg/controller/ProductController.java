package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.service.ProductService;

@RestController
@RequestMapping("/productapi")
public class ProductController {
	
	@Autowired
	private ProductService pservice;
	
	@PostMapping("/add")
	public String add(@RequestBody Product product) {
		
		return pservice.addProduct(product);
	}
	@GetMapping("/")
	public List<Product> getAll(){
		return pservice.getAllProducts();
	}
	@GetMapping("/{id}")
	public Product getById(@PathVariable("id") int pid){ {
		return pservice.findBy(pid);
	}
		
	}
		
	
}
