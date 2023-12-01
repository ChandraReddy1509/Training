package com.cg.dao;

import java.util.List;

import com.cg.entity.Employee;

public interface EmployeeDao {
	String addEmployee(Employee employee);
	
	 List<Employee> getAllEmployee();

}
