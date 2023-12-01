package com.cg.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table
public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String supplierName;
	private String supplierLocation;

	
	public Supplier() {	
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierLocation() {
		return supplierLocation;
	}

	public void setSupplierLocation(String supplierLocation) {
		this.supplierLocation = supplierLocation;
	}

	public Supplier(int id, String supplierName, String supplierLocation) {
		super();
		this.id = id;
		this.supplierName = supplierName;
		this.supplierLocation = supplierLocation;
	}
	@Override
	public String toString() {
		return "Supplier [id=" + id + ", supplierName=" + supplierName + ", supplierLocation=" + supplierLocation + "]";
	}

	

}
