package com.cg.Entity;

public class Employee {
	private int EmployeeCode;
	private String EmployeeName;
	private String Department;
	private double Salary;
	public Employee(int employeeCode, String employeeName, String department, double salary) {
		super();
		EmployeeCode = employeeCode;
		EmployeeName = employeeName;
		Department = department;
		Salary = salary;
	}
	public int getEmployeeCode() {
		return EmployeeCode;
	}
	public void setEmployeeCode(int employeeCode) {
		EmployeeCode = employeeCode;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}

}
