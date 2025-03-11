package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {
public static void main(String[] args) {
	//excuting by xml file..................................
	
//	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans_emp.xml");
	
	
	
	
	
//	Employee obj = (Employee) ctx.getBean("emp");
	/*
	Employee obj1 = ctx.getBean("emp1", Employee.class);
	
	System.out.println(obj1);
	
	System.out.println();
	Employee obj2 = (Employee) ctx.getBean("emp2");
	
	System.out.println(obj2);
	
	*/
	
	//getting excuting using Annotation @...................................
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(EmpConfig.class);
	
	Employee obj1 =(Employee) ctx.getBean("getEmp1");
	
	System.out.println(obj1);
	
Employee obj2 =(Employee) ctx.getBean("getEmp2");
	
	System.out.println(obj2);
	
	
	
	
	
}
}
