package com.test.entity;

public class Feedback {

	private int feedbackId ;
	private int rating;
	private Patient patient;
	private Doctor doctor;
	private String feedbackComment;
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
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
	public String getFeedbackComment() {
		return feedbackComment;
	}
	public void setFeedbackComment(String feedbackComment) {
		this.feedbackComment = feedbackComment;
	}
	
	
}
