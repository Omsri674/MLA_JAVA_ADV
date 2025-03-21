package com.test.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dao.UserDao;
import com.test.entity.User;
import com.test.repository.UserRepository;

public class UserDaoImpl implements UserDao{

	@Autowired
	private  UserRepository repository;
	@Override
	public User validateUser(User user) {
		return null;
		
	}

	@Override
	public User addUser(User user) {

		 repository.save(user);
		 return user;
	}

	@Override
	public User removeUser(User user) {
		
		repository.delete(user);
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

}
