package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.SupplierDao;
import com.cg.entity.Supplier;
import com.cg.repository.SupplierRepository;
@Service
public class SupplierService implements SupplierDao {
	
		@Autowired
		private SupplierRepository sr;

		@Override
		public String addSupplier(Supplier supplier) {
			System.out.println("reached service");
			sr.save(supplier);
			return "supplier added";
		}
		public List<Supplier> getAllSuppliers() {
			return sr.findAll();
		}
		@Override
		public Supplier getById(int id) {
			return sr.findById(id).get();
		}
		@Override
		public String deleteSupplier(int id) {
			sr.deleteById(id);
			return "deleted Supplier";
		}
		
		
	
		
		

				

		
}
		
