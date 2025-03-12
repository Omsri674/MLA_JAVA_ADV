package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
	/*	Address adr1 = new Address();
		adr1.setCity("Erode");
		adr1.setState("TN");
		adr1.setPin(600028);
		
		Employee emp1 = new Employee();
		emp1.setE_name("Eswar");
		emp1.setE_dept("Developer");
		emp1.setE_add(adr1);
		
		adr1.setEmp(emp1);
		session.save(emp1);
		
		*/
		Skill sk1 = new Skill();
		sk1.setS_name("SQL");
		
		Skill sk2 = new Skill();
		sk2.setS_name("JAVA");
			
		
		Skill sk3 = new Skill();
		sk3.setS_name("SPRING");
		
		
		Skill sk4 = new Skill();
		sk4.setS_name("FLUTTER");
		List<Skill> skList = new ArrayList<>();
		skList.add(sk1);
		skList.add(sk2);
		skList.add(sk3);
		skList.add(sk4);
		
		Student std = new Student();
		
		std.setName("OmSri");
		std.setSkill(skList);
		session.save(std);
		
		
		t.commit();
		System.out.println("DONE.....!");
		
	}

}
