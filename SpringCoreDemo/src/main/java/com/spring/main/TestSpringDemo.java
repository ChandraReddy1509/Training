package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.entity.Library;

public class TestSpringDemo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Library lib=(Library)context.getBean("libraryBean");
		System.out.println("Library details:");
		System.out.println(lib);
		
		
//		lib.setLocation("J.M Road");
//		System.out.println(lib);
		
//		Library lib1=(Library)context.getBean("libraryBean");
//		System.out.println("Library details1:");
//		System.out.println(lib1);
		
		
		//lib1.setRegno(2343);
		
		
	}

}
