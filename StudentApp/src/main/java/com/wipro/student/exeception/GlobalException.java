package com.wipro.student.exeception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<String> handleStudentException(String msg){
		return new ResponseEntity<>(msg, HttpStatus.BAD_REQUEST);
	}

}
