package com.stream.api;

public class EmployeeLamda {
	private static final char[] String = null;
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public EmployeeLamda(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
 
	
	public void display() {
		System.out.println("Salary :"+ salary);
		System.out.println("Name:"+ name);
	}


public static void main(String args[] ){
	
	EmployeeLamda el1=new EmployeeLamda("raj", 100);
	EmployeeLamda el=new EmployeeLamda("hajj", 1212);
	el.getName();
	//el.getSalary();
	//System.out.println(el );
	System.out.println(el1.getName());
		
	}
	
	
	
	
	
}

	

