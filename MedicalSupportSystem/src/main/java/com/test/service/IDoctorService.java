package com.test.service;

import java.util.List;

import com.test.entity.AvailabilityDates;
import com.test.entity.Doctor;

public interface IDoctorService {

	public Doctor addDoctor(Doctor bean);
	public Doctor updateDoctorProfile(Doctor bean);
	public Doctor getDoctor(Doctor doc);
	public Doctor removeDoctor(Doctor doc);
	
	public AvailabilityDates addAvailability(AvailabilityDates bean);
	public AvailabilityDates updateAvailability(AvailabilityDates bean);
	public List<Doctor> getDoctorList();
	public List<Doctor> getDoctorList(String speciality);
	
}
