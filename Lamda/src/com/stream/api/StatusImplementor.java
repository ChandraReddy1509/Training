package com.stream.api;

public class StatusImplementor {

	public static void main(String[] args) {
		EmployeeLamda employeeLamda = new EmployeeLamda("hqgs", 1625);
		EmployeeLamda employeeLamda2 = new EmployeeLamda("fewd", 16252);
		Status sc =(emp1,emp2)-> {
			
			if(emp1.getSalary() > emp2.getSalary()) {
				return emp1;
			}
			else if(emp1.getSalary() < emp2.getSalary()) {
				return emp2;
			}
			else 
				return null;

		};
		System.out.println(sc.checkStatus(employeeLamda,employeeLamda2).getSalary());

	}
}


