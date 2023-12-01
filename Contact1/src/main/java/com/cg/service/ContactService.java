package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.dao.ContactDao;
import com.cg.entity.ContactUsers;

public class ContactService implements ContactDao {
	List<ContactUsers> contacts=new ArrayList<>();
	public ContactService() {
		contacts.add(new ContactUsers(1, "raju"));
		contacts.add(new ContactUsers(2, "rajesh"));
		contacts.add(new ContactUsers(3, "rajendra"));
		
	}
	
	@Override
	public List<ContactUsers> getContactUsers(int userId) {
		
		return getContactUsers(userId);
	}
	 
	}

	


//	@Override
//	public List<ContactUsers> getContactUsers(int userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	

	


