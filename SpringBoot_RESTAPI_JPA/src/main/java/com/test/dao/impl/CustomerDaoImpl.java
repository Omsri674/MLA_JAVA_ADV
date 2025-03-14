package com.test.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.CustomerDao;
import com.test.model.Customer;
import com.test.repository.CustomerRepository;

@Repository
public class CustomerDaoImpl implements CustomerDao
{
	@Autowired
	private CustomerRepository repository;

	public void setRepository(CustomerRepository repository) {
		this.repository = repository;
	}

	@Override
	public Customer createCust(Customer c) {
		 
		return repository.save(c);
	}

	@Override
	public List<Customer> readAllCust() {
		 
		return repository.findAll();
	}

	@Override
	public List<Customer> updateCust(Customer c) {
		repository.save(c);
		return repository.findAll();
	}

	@Override
	public List<Customer> deleteCust(int id) {
		 
		repository.deleteById(id);
		
		return repository.findAll();
	}

}
