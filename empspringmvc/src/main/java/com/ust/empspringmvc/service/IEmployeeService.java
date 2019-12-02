package com.ust.empspringmvc.service;

import com.ust.empspringmvc.dto.EmployeeBean;

public interface IEmployeeService {
	public EmployeeBean login(int id,String password);
	public int register(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public  EmployeeBean searchEmpolyee(int id);
	public boolean updateEmployee(EmployeeBean bean);
	public boolean changePassword(String password,int id);
}
