package com.Customer.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Customer.entity.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Customer cust=(Customer)context.getBean("customerBeans");
		System.out.println(cust);
		
		
	}

}
