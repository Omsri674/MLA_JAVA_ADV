package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	/*
	@Query("select u from User u.fname = ?1")
	public User getByName(String name);
*/
	
	
}
