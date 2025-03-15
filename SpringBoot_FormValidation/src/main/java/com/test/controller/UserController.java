package com.test.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.model.User;
import com.test.service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	public UserService service;
	
	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}

	@GetMapping("/form")
	public String RegForm(Model model, User user) {
		model.addAttribute(user);
		return "register";
	}
	
	@PostMapping("/register")
	public String SubmitForm(@Valid @ModelAttribute("user") User user,
			BindingResult bindResult, Model model) {
		
		if(bindResult.hasErrors()) {
			
			return "register";
		}
		boolean validateCity = service.validateCity(user);
		if(validateCity) {
			String msg = "Please check your from and to city";
			model.addAttribute("user",msg);
			return "error";
		}
		
		service.resevationReq(user);
		return "success";
	}
	
}
