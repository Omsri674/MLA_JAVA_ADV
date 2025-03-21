package com.test.service;

import com.test.entity.User;

public interface IUserService {
	public User validateUser(User user);
	public User addUser(User user);
	public User removeUser(User user);
	public User updateUser(User user);
	

}
