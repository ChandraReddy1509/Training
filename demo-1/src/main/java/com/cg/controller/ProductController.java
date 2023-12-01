package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		public String add(@Valid @RequestBody Product product) {
			
			return pservice.addProduct(product);
		}
		@GetMapping("/")
		public List<Product> getAll(){
			return pservice.getAllProducts();
		}
		@GetMapping("/{id}")
		public Product getById(@PathVariable("id") int pid){ 
			return pservice.findBy(pid);
		}
		@GetMapping("/remove/{id}")
		public String deleteById(@PathVariable("id") int pid)
		{
			return pservice.deleteProduct(pid);
		}
//	@PutMapping("/update/{id}/{price}")
//		public String updatePrice(@PathVariable("id") int pid,@PathVariable("price") double price){
//			return pservice.updateProduct(pid,price);
	
		@PutMapping("/update")
		public String updateProduct(@RequestBody Product product) {
			return pservice.upadteProduct(product);
			
		}
			
		@GetMapping("getbyname/{pname}")	
			public Product getByName(@PathVariable("pname") String name) {
			return pservice.getByProductName(name);
		}
		
		
		@GetMapping("/getByStockValue/{stk}")
		public List<Product> getByStock(@PathVariable("stk") int stock){
			return pservice.getProductByStock(stock);
		}
			
			
			
			
			
			
				
			}
		
			


