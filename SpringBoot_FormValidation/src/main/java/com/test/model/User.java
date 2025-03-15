package com.test.model;

import java.util.Arrays;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "User")
//@NamedNativeQuery(name="User.name", query ="select u from user u where u.id = ?1")

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotEmpty(message = "name required")
	@Size(min = 3, max = 20)
	private String fname;
	
	@NotEmpty(message = "name required")
	@Size(min = 3, max = 20)
	private String lname;
	
	@NotEmpty(message = "gender required")
	private String gender;
	
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private String startDate;
	
	
	private String[] food;
	
	@NotEmpty(message = "enter from city ")
	private String cityfrom;
	
	@NotEmpty(message = "enter to city ")
	private String cityto;
	
	@NotEmpty
	private String[] seat;

	

	public User(@NotEmpty(message = "name required") @Size(min = 3, max = 20) String fname,
			@NotEmpty(message = "name required") @Size(min = 3, max = 20) String lname,
			@NotEmpty(message = "gender required") String gender, String startDate, String[] food,
			@NotEmpty(message = "enter from city ") String cityfrom,
			@NotEmpty(message = "enter to city ") String cityto, @NotEmpty String[] seat) {
		
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.startDate = startDate;
		this.food = food;
		this.cityfrom = cityfrom;
		this.cityto = cityto;
		this.seat = seat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getFood() {
		return food;
	}

	public void setFood(String[] food) {
		this.food = food;
	}

	public String getCityfrom() {
		return cityfrom;
	}

	public void setCityfrom(String cityfrom) {
		this.cityfrom = cityfrom;
	}

	public String getCityto() {
		return cityto;
	}

	public void setCityto(String cityto) {
		this.cityto = cityto;
	}

	public String[] getSeat() {
		return seat;
	}

	public void setSeat(String[] seat) {
		this.seat = seat;
	}
	
	public boolean validate(String u1, String u2) {
		if(u1.equals(cityto)) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", startDate="
				+ startDate + ", food=" + Arrays.toString(food) + ", cityfrom=" + cityfrom + ", cityto=" + cityto
				+ ", seat=" + Arrays.toString(seat) + "]";
	}
	
	
	
}
