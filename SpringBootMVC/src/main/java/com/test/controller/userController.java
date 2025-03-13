package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.User;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class userController {
	
	/*
	
	@RequestMapping("/submit")
	public String submitForm(HttpServletRequest request,Model model ) {
		
		String name = request.getParameter("uname");
		String pas = request.getParameter("pwd");
		
		
		
		User user = new User();
		user.setUserName(name);
		user.setPassword(pas);
		
		model.addAttribute("info",user);
		return "userData";
	}
	*/
	
	@RequestMapping("/submit")
	public String submitForm(
			@RequestParam("uname") String name,
			@RequestParam("pwd") String pass,
			Model model, User user
			
			) {
		user.setPassword(pass);
		user.setUserName(name);
		model.addAttribute("info",user);
		return "userData";
	}
}
