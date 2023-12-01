package com.onlinepizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinepizza.IPizzaService;
import com.cg.onlinepizza.entity.Pizza;
import com.cg.onlinepizza.impl.IserviceImpl;
@RestController
public class PizzaController  {
	@Autowired
	private IserviceImpl iservice;
	
	@PostMapping("/add")
	public void addAPizza(@RequestBody Pizza pizza) {
		iservice.addPizza(pizza);
	}
	@GetMapping("/get")
	public List<Pizza> viewAllPizza(){
		return IPizzaService.viewAllPizza();
	}
}
