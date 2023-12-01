package com.cg.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeCode;
	private String employeeName;
	private int employeeId;
	@Override
	public String toString() {
		return "Employee [employeeCode=" + employeeCode + ", employeeName=" + employeeName + ", employeeId="
				+ employeeId + "]";
	}
	public Employee(int employeeCode, String employeeName, int employeeId) {
		super();
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}
	public Employee() {
	}
	public int getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}
