package com.PersonPAn;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity(name="Persontab")
public class PersonC {
	@Id
	private int PersonId;
	private int Age;
	private String name;
	public int getPersonId() {
		return PersonId;
	

	}
	@OneToOne
	private Pan1 pan;
	
	public PersonC(){
		
	}
	public void setPersonId(int personId) {
		PersonId = personId;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
	@Override
	public String toString() {
		return "PersonC [PersonId=" + PersonId + ", Age=" + Age + ", name=" + name + ", pan=" + pan + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PersonC(int personId, int age, String name,Pan1 pan) {
		super();
		this.PersonId = personId;
		this.Age = age;
		this.name = name;
		this.pan=pan;
	}

}

