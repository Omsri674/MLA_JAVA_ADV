package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStud {
public static void main(String[] args) {
	
//	ApplicationContext ctx = new ClassPathXmlApplicationContext("beanStu.xml");
	ApplicationContext ctx = new AnnotationConfigApplicationContext(StuConfig.class);
	
	Student obj =  ctx.getBean("getStud",Student.class);
	obj.setId(205);
	obj.setName("Varun");
	List<String> sk = Arrays.asList("JAVA","SQL","SPRING","C");
	obj.setSkill(sk);
	System.out.println(obj);
	 
	ApplicationContext ordac = new AnnotationConfigApplicationContext(StuConfig.class);
	
	Order ord = (Order) ordac.getBean("getOrder",Order.class);
	System.out.println(ord);
	
}
}
