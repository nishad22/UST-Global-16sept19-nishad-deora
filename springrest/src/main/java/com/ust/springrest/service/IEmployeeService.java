package com.ust.springrest.service;

import java.util.List;

import com.ust.springrest.dto.EmployeeBean;


public interface IEmployeeService {
	public boolean updateProfile(EmployeeBean bean);
	public boolean addEmployee(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeeBean getEmployee(int id);
	public List<EmployeeBean> getAllEmployee();
}
