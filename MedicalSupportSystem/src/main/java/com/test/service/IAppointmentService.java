package com.test.service;

import java.time.LocalDate;
import java.util.List;

import com.test.entity.Appointment;
import com.test.entity.Doctor;

public interface IAppointmentService {

	List<Appointment> getAllAppointment();
	List<Appointment> getAppointments(Doctor doctor);
	List<Appointment> getAppointments(LocalDate date);
	Appointment getAppointments(int appointmentId);
	Appointment addAppointments(Appointment appointment);
	Appointment deleteAppointments(int appointmentId);
	Appointment updateAppointments(Doctor doctor);
	
}
