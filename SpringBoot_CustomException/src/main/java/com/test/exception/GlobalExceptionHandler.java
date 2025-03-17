package com.test.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductNOTFOUNDException.class)
	public ResponseEntity<ErrorMessage> ProductNotFoundException
	(ProductNOTFOUNDException err, WebRequest request){
	
		ErrorMessage errorMsg = new ErrorMessage();
		
		int statusCode = HttpStatus.BAD_REQUEST.value();
		
		String desc = request.getDescription(false);
		
		errorMsg.setTimestamp(new Date());
		errorMsg.setUrl(desc);
		errorMsg.setStatusCode(statusCode);
		errorMsg.setMsg(err.getMessage());
		
		return new ResponseEntity<>(errorMsg,HttpStatus.BAD_REQUEST) ;
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> unknownExceptions
	(Exception e, WebRequest request){
	
		ErrorMessage errorMsg = new ErrorMessage();
		
		int statusCode = HttpStatus.BAD_REQUEST.value();
		
		String desc = request.getDescription(false);
		
		errorMsg.setTimestamp(new Date());
		errorMsg.setUrl(desc);
		errorMsg.setStatusCode(statusCode);
		errorMsg.setMsg(e.getMessage());
		
		return new ResponseEntity<>(errorMsg,HttpStatus.BAD_REQUEST) ;
		
	}
	
}
