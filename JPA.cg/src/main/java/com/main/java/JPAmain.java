package com.main.java;

import javax.persistence.*;


import javax.persistence.*;

import com.JPA.entity.Book;

public class JPAmain {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("reddy").createEntityManager();
		System.out.println("connct");

		System.out.println("session start");
		
		em.getTransaction().begin();
		
//		Book book = new Book();
//		
//		book.setTitle("java");
//		book.setAuthor("agnee");
//		book.setPrice(2023);
////		
//		em.persist(book);
//		em.getTransaction().commit();	
		
		
		Query myQuery= em.createQuery("select b from Book b where b.price>2000");
		System.out.println(myQuery.getResultList());
		
		
//		@SuppressWarnings("unchecked")
//		List<Product> plist= myQuery.list();
//		for(Product p:plist) {
//			System.out.println(p);
		
		em.close();
		
		
		
		

	}

}
