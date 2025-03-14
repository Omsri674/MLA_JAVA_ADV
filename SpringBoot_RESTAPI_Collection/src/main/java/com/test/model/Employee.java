package com.test.model;

public class Employee {

	private Integer id;
	private String Ename;
	private String dept;
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String ename, String dept) {
		super();
		this.id = id;
		Ename = ename;
		this.dept = dept;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Ename=" + Ename + ", dept=" + dept + "]";
	}
	
	
	 
}
