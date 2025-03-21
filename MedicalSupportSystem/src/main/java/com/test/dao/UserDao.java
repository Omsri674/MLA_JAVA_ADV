package com.test.dao;

import com.test.entity.User;

public interface UserDao {

	User validateUser(User user);
	User addUser(User user);
	User removeUser(User user);
	User updateUser(User user);
}
