package com.cg.dao;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import feign.Client;
@FeignClient(name="dao" ,url="http://localhost:8067")
public interface ClientDao {
	
	@GetMapping("/getAll")
	public List<Client> getAllClient();
	

}
