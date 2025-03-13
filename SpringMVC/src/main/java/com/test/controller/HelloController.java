package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HelloController {

	@RequestMapping("/homepage")
	public String HomePage() {
		return "home";
	}
	
	@RequestMapping("/greet")
	public String GreetPage() {
		return "Welcome to our site";
	}
	
}
