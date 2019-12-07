package com.ust.springboot.dao;

import java.util.List;

import com.ust.springboot.dto.EmployeeBean;

public interface IEmployeeDAO {
	//public EmployeeBean login(int id,String password);
	//public int register(EmployeeBean bean);
	public boolean updateProfile(EmployeeBean bean);
	public boolean addEmployee(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeeBean getEmployee(int id);
	public List<EmployeeBean> getAllEmployee();
}
