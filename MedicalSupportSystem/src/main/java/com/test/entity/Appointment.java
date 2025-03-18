package com.test.entity;

import java.time.LocalDate;

public class Appointment {

	private int appoitmentId;
	private Patient patient;
	private Doctor doctor;
	private LocalDate appointmentDate;
	private String appointmentStatus;
	private String remark;
	public int getAppoitmentId() {
		return appoitmentId;
	}
	public void setAppoitmentId(int appoitmentId) {
		this.appoitmentId = appoitmentId;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentStatus() {
		return appointmentStatus;
	}
	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
