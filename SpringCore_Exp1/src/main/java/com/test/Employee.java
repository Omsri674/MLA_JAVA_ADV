package com.test;

public class Employee {

	
	private int id;
	private String name;
	private String dept;
	private String loc;
	private Address add;
	
	public Employee() {
		
	}
	
	
	
	public Employee(int id, String name, String dept, String loc, Address add) {
		
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.add = add;
	}



	public Address getAdd() {
		return add;
	}



	public void setAdd(Address add) {
		this.add = add;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", loc=" + loc + " Address= "+add+ "]";
	}
	
	
	
}
