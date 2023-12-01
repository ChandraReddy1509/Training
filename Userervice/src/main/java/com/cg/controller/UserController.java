package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.demo.Users;
import com.cg.service.UserDaoImpl;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserDaoImpl uimpl;
	@GetMapping("/")
	public List<Users> getAllUsers(){
		return uimpl.getAllgUsers();
		
	}
	
	
	

}
