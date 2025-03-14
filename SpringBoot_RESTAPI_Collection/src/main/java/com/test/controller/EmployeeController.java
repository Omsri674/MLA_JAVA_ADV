package com.test.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Employee;
import com.test.model.Employees;
import com.test.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping(value = "/create", consumes = "application/json")
	public List<Employee> createEmployee(@RequestBody Employee emp) {

		int i = service.getEmp().size()+1;
		emp.setId(i);
		service.createEmp(emp);
		
		return service.getEmp();
	}
	
	@GetMapping(value = "/readall", produces = "application/json")
	public List<Employee> getAllEmployee() {
		return service.getEmp();
	}
	
	@PutMapping(value = "/update/{id}",consumes = "application/json")
	public List<Employee> updateEmployee(@RequestBody Employee e,@PathVariable("id") int id){
		e.setId(id);
		service.updateEmp(e);
		
		return service.getEmp();
		
	}
	
	@DeleteMapping(value = "/delete/{id}",produces = "application/json")
	public List<Employee> deleteEmployee(@PathVariable("id") int id){
		 
		service.deleteEmp(id);
		return service.getEmp();
	}
	
	
}
