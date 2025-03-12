package com.test;

import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Table(name="employee2")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int id;
	private String e_name;
	private String e_dept;
	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)		
	private Address e_add;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_dept() {
		return e_dept;
	}
	public void setE_dept(String e_dept) {
		this.e_dept = e_dept;
	}
	public Address getE_add() {
		return e_add;
	}
	public void setE_add(Address e_add) {
		this.e_add = e_add;
	}
	
}
