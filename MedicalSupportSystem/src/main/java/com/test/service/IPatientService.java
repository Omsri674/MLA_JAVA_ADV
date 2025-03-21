package com.test.service;

import java.time.LocalDate;
import java.util.List;

import com.test.entity.Doctor;
import com.test.entity.Patient;

public interface IPatientService {


	Patient addPatient(Patient bean);
	Patient updatePatient(Patient bean);
	Patient removePatient(Patient bean);
	Patient getPatient(Patient bean);
	List<Patient> getPatientListByDoctor(Doctor doc);
	List<Patient> getAllPatient();
	List<Patient> getPatientByDate(LocalDate appdate);
	
	
	
}

