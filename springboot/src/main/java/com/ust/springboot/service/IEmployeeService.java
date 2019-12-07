package com.ust.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ust.springboot.dto.EmployeeBean;

//@Service
public interface IEmployeeService {
	public boolean updateProfile(EmployeeBean bean);
	public boolean addEmployee(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeeBean getEmployee(int id);
	public List<EmployeeBean> getAllEmployee();
}
