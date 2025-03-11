package com.test;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StuConfig {
	
	@Bean
	public static Student getStud() {
		return new Student();
	}
	
	
	@Bean
	public static Order getOrder() {
		
		return new Order(454, "Biriyani", 120);
		
	}
	
	

}
