package com.cg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.ClientDao;

import feign.Client;

@RestController
public class ClientController {
	
	@Autowired
	private ClientDao cd;
	
	@GetMapping("/getAll")
	public List<Client> getAllClient(){
	return cd.getAllClient();
			
	

}}

