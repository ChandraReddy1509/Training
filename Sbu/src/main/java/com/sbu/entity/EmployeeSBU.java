package com.sbu.entity;

import java.util.List;

public class EmployeeSBU {
	
	private int sbuCode;
	private String sbuName;
	private String sbuHead;
	List<Employee> empList;
	
	public EmployeeSBU() {
		
	}

	@Override
	public String toString() {
		return "EmployeeSBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", empList="
				+ empList + "]";
	}

	public EmployeeSBU(int sbuCode, String sbuName, String sbuHead, List<Employee> empList) {
		super();
		this.sbuCode = sbuCode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.empList = empList;
	}

	public int getSbuCode() {
		return sbuCode;
	}

	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	

}
