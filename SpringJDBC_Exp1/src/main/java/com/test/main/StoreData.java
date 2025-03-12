package com.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.CustDao;
import com.test.model.Customer;
public class StoreData {

	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		Customer cObj1 = new Customer();
		
		cObj1.setName("Omsri");
		cObj1.setType("Regular");
		
		
		
Customer cObj2 = new Customer();
		
		cObj2.setId(1);
		cObj2.setName("Eswar");
		cObj2.setType("Preffered");
		
		CustDao cust = ctx.getBean("custDao",CustDao.class);
		
//		cust.createCust(cObj1);
//		cust.UpdateCust(cObj2);
		
		
		Customer cObj3 = new Customer();
		cObj3.setId(1);
		cust.DeleteCust(cObj3);
		
		System.out.println(cust.getAllCust());
		
		
		
		
			
	}
}
