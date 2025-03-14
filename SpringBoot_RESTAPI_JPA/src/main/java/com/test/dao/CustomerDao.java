package com.test.dao;

import java.util.List;

import com.test.model.Customer;

public interface CustomerDao {

	public Customer createCust(Customer c);
	public List<Customer> readAllCust();
	public List<Customer> updateCust(Customer c);
	public List<Customer> deleteCust(int id);
	
}
