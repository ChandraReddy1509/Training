package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.entity.ContactUsers;
import com.cg.service.ContactService;

public class ContactController {
	@Autowired
	private ContactService cservice;
	
	@GetMapping("/contact/{uid}")
	public List<ContactUsers> getContactUsers(@PathVariable("uid") int userId){
		return cservice.getContactUsers(userId);
		
	}
	
	
	
		
	}


