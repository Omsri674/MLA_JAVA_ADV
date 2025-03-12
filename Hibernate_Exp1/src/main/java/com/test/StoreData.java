package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {
		//1 create config class object 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//2 create SessionFactory object
		SessionFactory sf = cfg.buildSessionFactory();
		
		//3 create Session object
		Session session = sf.openSession();
		
		//4 transaction object
		Transaction t = session.beginTransaction();
		
		//transient state
		Book b = new Book();
		b.setName("JAVA");
		b.setAuth("Adhavn");
		b.setPrice(1);
		
		//5 execute the object
		session.save(b); //persistent state  
		
		
		//Book bobj= session.get(Book.class, 1);
		//System.out.println(bobj);
		t.commit();
		System.out.println("Done...!");
		
		//6 close session object
		session.close(); //detached state
	}
}
