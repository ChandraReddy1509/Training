package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cg.service.DemoDaoService;

@Controller
@ResponseBody
public class DemoController {
	
	@Autowired
	DemoDaoService service;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello() {
		return service.sayHello();
		
	}	

	
//	@GetMapping("/Calc" )
//	public int getSum() {
//		return service.Calculate(200,3);
				
	
	public int getCalc(@RequestParam("x1")int data1,@RequestParam("x2")int data2) {{
		return service.Calculate(data1, data2);
	}
}}