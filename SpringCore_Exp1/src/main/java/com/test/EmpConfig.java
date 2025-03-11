package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {

	@Bean
	public static Address getAdd1() {
		return new Address();
	}
	
	@Bean
	public static Address getAdd2() {
		return new Address(124,"palani st","TN" );
	}
	
	@Bean
	public static Employee getEmp1() {
		
		return new Employee();
	}

	@Bean
	public static Employee getEmp2() {
		return new Employee(304,"kavi","Management","salem",getAdd2());
	}
	
	
	
}
