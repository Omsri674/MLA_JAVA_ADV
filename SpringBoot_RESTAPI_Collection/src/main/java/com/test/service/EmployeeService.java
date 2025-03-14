package com.test.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.test.doa.EmployeeDao;
import com.test.model.Employee;
import com.test.model.Employees;

@Repository
@Service
public class EmployeeService implements EmployeeDao{

	
	private static Employees empData = new Employees();
	static {
		empData.getEmpList().add(new Employee(101,"Abi","Testing"));
		empData.getEmpList().add(new Employee(102,"Bala","HR"));
		empData.getEmpList().add(new Employee(103,"Charu","Developer"));
		empData.getEmpList().add(new Employee(104,"Dharun","Testing"));
		empData.getEmpList().add(new Employee(105,"Eswar","Developer"));
		empData.getEmpList().add(new Employee(106,"Fagath","Admin"));
	}
	
	@Override
	public Employee createEmp(Employee e) {
		empData.getEmpList().add(e);
		return e;
	}

	@Override
	public String updateEmp(Employee e) {
		
		for(int i=0;i<empData.getEmpList().size();i++) {
			Employee emp = empData.getEmpList().get(i);
			if(emp.getId().equals(e.getId())) {
				empData.getEmpList().set(i, e);
			}
		}
		
		return "Given id has no data Please verify it...";
	}

	@Override
	public List<Employee> getEmp() {
		
		return empData.getEmpList();
	}

	@Override
	public String deleteEmp(Integer id) {
		
		for(int i=0;i<empData.getEmpList().size();i++) {
			Employee emp = empData.getEmpList().get(i);
			if(emp.getId().equals(id)) {
				empData.getEmpList().remove(i);
				
			}
		}
		
		return "Given id has no data Please verify it...";
	}

	
	
}
