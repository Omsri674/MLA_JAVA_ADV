package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
	
}
