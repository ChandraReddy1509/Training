package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService eservice;

	@PostMapping("/add")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		eservice.addEmployee(employee);
		return "successful";
	}
	
	@GetMapping("/getemployee")
	public String getAll(Model model) {
		Employee employee=new Employee();
		model.addAttribute("employee",employee);
		return "employeeslist";
	}

	@GetMapping("/employeeform")
	public String showAddForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "employee";
	}
}
