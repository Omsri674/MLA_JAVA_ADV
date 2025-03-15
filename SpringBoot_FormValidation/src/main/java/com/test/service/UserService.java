package com.test.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.User;
import com.test.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private  UserRepository repository;
	
	
	

	private static List<User> userList = new ArrayList<>();
	
	static {
		String[] food = {"Breakfast","Lunch","Dinner"};
		String[] seat = {"M1","M2","U1","U2","L1","L2"};
		userList.add(new User("Omsri","Eswar","male","15/03/2025", food,"Erode","Chennai",seat));
		
		
	}
	public  User resevationReq(User user) {
		userList.add(user);
		return repository.save(user);
		
	}
	
	public  boolean validateCity(User user) {
		boolean ft = user.validate(user.getCityfrom(), user.getCityto());
		
		return ft;
	}
	
	
}
