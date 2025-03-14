package com.test.service;

import java.util.List;

import com.test.model.Customer;

public interface CustomerService {

	public Customer createCust(Customer c);
	public List<Customer> updateCust(Customer c);
	public List<Customer> readAllCust();
	public List<Customer> deleteCust(int id);
	
}
