package com.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "emp")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//auto value is generated 

	private int ecode;
	private String ename;
	private double salary;

	public Employee() {

	}

	public int getEcode() {
		return ecode;
	}

	public void setEcode(int ecode) {
		this.ecode = ecode;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int ecode, String ename, double salary) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ecode=" + ecode + ", ename=" + ename + ", salary=" + salary + "]";
	}

}
