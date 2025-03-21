package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User validateUser(User user);
	User addUser(User user);
	User removeUser(User user);
	User updateUser(User user);

}
