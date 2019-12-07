package com.ust.springrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.springrest.dto.EmployeeBean;
import com.ust.springrest.dto.EmployeeResponse;
import com.ust.springrest.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping(path="/add", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public  EmployeeResponse addEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data added to the DB");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the DB");
		}
		
		return response;
	}// end of addemployee
	
	@PutMapping(path="/modify",
			consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateProfile(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.updateProfile(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data modify to the DB");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not modify to the DB");
		}
		
		return response;
	}//end of update
	
	@DeleteMapping(path="/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.deleteEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data delete to the DB");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not delete to the DB");
		}
		
		return response;
	}//end of deleteemployee
	
	@GetMapping(path="/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		EmployeeBean bean = service.getEmployee(id);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found to the DB");
			response.setEmployeeBeans(Arrays.asList(bean));//it will return only singlle object
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found to the DB");
		}
		return response;
	}//end of getEmoloyee
	
	@GetMapping(path="/get-all",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployeeDetails(){
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeBean> bean = service.getAllEmployee();
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found to the DB");
			response.setEmployeeBeans(bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found to the DB");
		}
		return response;
	}//end of getAllEmoloyee
	
	@GetMapping(path="/exec",produces = MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		int i = 1/0;
	}
}

