package com.test.doa;


import java.util.List;

import com.test.model.Employee;

public interface EmployeeDao {

	public Employee createEmp(Employee e);
	public String updateEmp(Employee e);
	public List<Employee> getEmp();
	public String deleteEmp(Integer id);
	
	
	
	
}
