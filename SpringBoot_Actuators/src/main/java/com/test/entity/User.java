package com.test.entity;

import org.springframework.beans.factory.annotation.Value;

public class User {

	@Value("${name.fname}")
	private String fname;
	@Value("${mail.email}")
	private String email;
	@Value("${desg.roll}")
	private String desg;
	@Override
	public String toString() {
		return "User [fname=" + fname + ", email=" + email + ", desg=" + desg + "]";
	}
	
	
}
