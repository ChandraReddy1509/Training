package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.dao.*;
@Service
public class DemoDaoService implements Demo {

	
	public String sayHello() {
		// TODO Auto-generated method stub
		return "hello reddy";
	}
	@Override
	public int Calculate(int n1,int n2) {
		return n1+n2;
	
	}
	

}
