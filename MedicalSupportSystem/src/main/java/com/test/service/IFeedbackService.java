package com.test.service;

import java.util.List;

import com.test.entity.Doctor;
import com.test.entity.Feedback;

public interface IFeedbackService {

	public Feedback addFeedback(Feedback fbd);
	public Feedback getFeedback(Feedback fbd);
	public List<Feedback> getAllFeedback(Doctor doc);
	

}
