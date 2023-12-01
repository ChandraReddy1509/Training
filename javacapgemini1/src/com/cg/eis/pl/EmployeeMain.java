package com.cg.eis.pl;

import com.cg.eis.service.ServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		ServiceImpl e=new ServiceImpl();
		e.getEmployeeDetails();
		e.InsuranceScheme();
		e.details();
	}

}
