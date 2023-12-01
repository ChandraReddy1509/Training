package com.PersonPAn;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Pan")
public class Pan1 {
	
	@Id
	private String  panNo;
	private String DOB;
	private String FatherName;
	
	
	
	public Pan1() {
		
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getFatherName() {
		return FatherName;
	}

	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}

	public Pan1(String panNo, String dOB, String fatherName) {
		super();
		this.panNo = panNo;
		DOB = dOB;
		FatherName = fatherName;
	}

	@Override
	public String toString() {
		return "Pan1 [panNo=" + panNo + ", DOB=" + DOB + ", FatherName=" + FatherName + "]";
	}
	

}
