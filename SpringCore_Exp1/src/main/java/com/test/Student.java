package com.test;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private List<String> skill;
	
	

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

	public List<String> getSkill() {
		return skill;
	}

	public void setSkill(List<String> skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", skill=" + skill + "]";
	}
	
	
}
