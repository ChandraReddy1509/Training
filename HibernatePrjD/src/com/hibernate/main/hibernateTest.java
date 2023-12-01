package com.hibernate.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Product;

public class hibernateTest {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();

		Session session= sf.openSession();
		Transaction transaction= session.beginTransaction();
//
	//	Product product= new Product("tomatato",12,25,230);
//		
//		
//		//add 
//		
//		session.save(product);//add 
//		System.out.println("data persisted");
//		transaction.commit();
//		sf.close();
//		Product pr=(Product) session.load(Product.class, 1);//select
//		pr.setPrice(pr.getPrice() +500);//update 
//		//session.save(pr);
//		session.saveOrUpdate(pr);
//		session .beginTransaction().commit();
////		
//	
//		
////		for getting list ,,,
//		String query= "select p from Product p";
//		Query
//		myQuery= session.createQuery(query);
//		@SuppressWarnings("unchecked")
//		List<Product> plist= myQuery.list();
//		for(Product p:plist) {
//			System.out.println(p);
//		}
		
		//Object pr = session.load(Product.class, 1);
		Query query=session.createQuery("select p from Product p where p.pcode (6,20)");
		@SuppressWarnings("unused")
		Object pr  = query.uniqueResult();
		System.out.println("added");
		session.beginTransaction().commit();
		sf.close();

	}

}
