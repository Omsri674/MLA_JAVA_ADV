package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CustomerDao;
import com.test.model.Customer;
import com.test.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Customer createCust(Customer c) {
		try {
			if(c != null) {
				customerDao.createCust(c);
			}
		}catch (RuntimeException e) {
			  e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<Customer> updateCust(Customer c) {
		 try {
			 
			 if(c != null) {
				 customerDao.updateCust(c);
			 }
			 
		 }catch (RuntimeException e) {
			 e.printStackTrace();
		}
		return customerDao.readAllCust();
	}

	@Override
	public List<Customer> readAllCust() {
		List<Customer> list = customerDao.readAllCust();
		if(list.size() <=0) {
			System.out.println("NO CONTENT");
		}
		return list;
	}

	@Override
	public List<Customer> deleteCust(int id) {
 try {
			 
			 if(id != 0) {
				 customerDao.deleteCust(id);
			 }
			 
		 }catch (RuntimeException e) {
			 e.printStackTrace();
		} 
		return customerDao.readAllCust();
	}

}
