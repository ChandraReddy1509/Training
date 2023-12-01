package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public  class ServiceImpl implements EmployeeService{
	Employee e=new Employee();
	@Override
	public void getEmployeeDetails() {


		Scanner sc=new Scanner(System.in);
		System.out.println("enter id:");
		int id1=sc.nextInt();
		e.setId(id1);
		System.out.println("enter name");
		String n=sc.next();
		e.setName(n);
		System.out.println("enter salary");
		int salary1=sc.nextInt();
		e.setSalary(salary1);
		System.out.println("enter designation:");
		String des=sc.next();
		e.setDesignation(des);
		System.out.println("enter ins:");
		String ins=sc.next();
		e.setInsuranceScheme(ins);


	}
	@Override
	public void InsuranceScheme(){
		if( e.getSalary() <=100) {
			System.out.println("scheme A");
		}
		else if(e.getSalary()>100 && e.getSalary()<=200) {
			System.out.println("schemeB");
		}
		else {
			System.out.println("scheme c");
		}
	}
		@Override
		
		public void details() {
			System.out.println("id:"+ e.getId());
			System.out.println("name:"+ e.getName());
			System.out.println("salary:"+e.getSalary());
			System.out.println("designation:"+ e.getDesignation());
			System.out.println("insuranceScheme:"+ e.getInsuranceScheme());
		}
}
		
