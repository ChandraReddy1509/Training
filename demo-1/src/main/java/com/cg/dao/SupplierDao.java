package com.cg.dao;

import java.util.List;

import com.cg.entity.Supplier; 


public interface SupplierDao {
	
	public String addSupplier(Supplier supplier);

	//public List <Supplier> getAllSuppliers();
	public List<Supplier> getAllSuppliers();

	public Supplier getById(int id);

	public String deleteSupplier(int id);

}
