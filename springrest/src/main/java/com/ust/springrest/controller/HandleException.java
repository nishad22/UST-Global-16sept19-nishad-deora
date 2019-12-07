package com.ust.springrest.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ust.springrest.dto.EmployeeResponse;

//@ControllerAdvice//for spring mvc
@RestControllerAdvice
public class HandleException {
	@ExceptionHandler(Exception.class)
	public  EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Error in code");
		response.setDescription("Got an execption");
		return response;
	}
}
