package com.test.controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "HelloWorldController", description = "the REST API")
@RestController
public class HelloWorld {

	@Value("${name.fname}")
	private String fname;
	
	@Operation(summary = "printing the values")
	@GetMapping("/test")
	public String testActuator() {
		User obj = new User();
		
		return "Simple Actuator Response "+fname+" \n This is from the User POJO clz"+obj;
		
	}
}
