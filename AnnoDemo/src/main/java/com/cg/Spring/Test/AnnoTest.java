package com.cg.Spring.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.Spring.config.BeanConfig;
import com.cg.Spring.entity.Book;
import com.cg.Spring.entity.Librarry;
import com.cg.Spring.entity.Magzine;

public class AnnoTest {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(BeanConfig.class);
		
//		Book book=context.getBean(Book.class);
//		System.out.println(book);
//		
//		Librarry librarry=context.getBean(Librarry.class);
//		System.out.println(librarry);
		Magzine mm=(Magzine)context.getBean("magzine");
		System.out.println(mm);
		
		
	}

}
