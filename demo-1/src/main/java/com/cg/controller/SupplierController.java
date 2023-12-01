package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.entity.Supplier;
import com.cg.service.SupplierService;

public class SupplierController {

	@Autowired
	private SupplierService service;

	@PostMapping("/add")
	public String addSupplier(@RequestBody Supplier supplier)

	{
		System.out.println("Reached controller");
		return service.addSupplier(supplier);
	}

	@GetMapping("/")
	public List<Supplier> getAllSuppliers() {
		return service.getAllSuppliers();
	}
	
	@GetMapping("/{id}")
	public Supplier getById(@PathVariable("id") int id) {
		return service.getById(id);
	}

	@DeleteMapping("/{id}")
	public String deleteBy(@PathVariable("id") int id) {
		return service.deleteSupplier(id);

	}

}
