package com.test.model;

public class Customer {
	
	private int id;
	private String name;
	private String type;
	
	public Customer() {
		
	}
	
	public Customer(int i,String n,String t) {
		this.id = i;
		this.name=n;
		this.type= t;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
	
	

}
