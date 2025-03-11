package com.test;

public class Address {

	
	private int doornum;
	private String strt;
	private String st;
	
	
	
	
	
	public Address() {
		
	}





	public Address(int doornum, String strt, String st) {
		super();
		this.doornum = doornum;
		this.strt = strt;
		this.st = st;
	}





	public int getDoornum() {
		return doornum;
	}





	public void setDoornum(int doornum) {
		this.doornum = doornum;
	}





	public String getStrt() {
		return strt;
	}





	public void setStrt(String strt) {
		this.strt = strt;
	}





	public String getSt() {
		return st;
	}





	public void setSt(String st) {
		this.st = st;
	}





	@Override
	public String toString() {
		return "Address [doornum=" + doornum + ", strt=" + strt + ", st=" + st + "]";
	}
	
}
