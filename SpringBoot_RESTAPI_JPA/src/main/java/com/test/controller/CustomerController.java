package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Customer;
import com.test.service.CustomerService;

@RestController
@RequestMapping("/customer/v1")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	
	
	public void setService(CustomerService service) {
		this.service = service;
	}

	@PostMapping("/create")
	public Customer createCustomer(@RequestBody Customer c) {
		return service.createCust(c);
		
	}
	
	@GetMapping(value = "/listAll")
	public List<Customer> listAllCustomers(){
		return service.readAllCust();
	}
	
	@PutMapping(value = "/update/{id}")
	public List<Customer> UpdateCustomer(@RequestBody Customer c ,@PathVariable("id")int id){
	
	c.setId(id);
	
	return service.updateCust(c);
}

@DeleteMapping(value = "/delete/{id}")
public List<Customer> deleteCustomer(@PathVariable("id")int id){



return service.deleteCust(id);
}

}
