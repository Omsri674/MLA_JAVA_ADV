package com.test.entity;

import java.time.LocalDate;

public class AvailabilityDates {

	private int availabilityId;
	private Doctor doctor;
	private LocalDate fromDate;
	private LocalDate endDate;
	public int getAvailabilityId() {
		return availabilityId;
	}
	public void setAvailabilityId(int availabilityId) {
		this.availabilityId = availabilityId;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	
}
