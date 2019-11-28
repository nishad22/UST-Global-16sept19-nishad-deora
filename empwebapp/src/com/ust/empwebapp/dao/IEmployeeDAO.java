package com.ust.empwebapp.dao;

import com.ust.empwebapp.dto.EmployeeInfo;

public interface IEmployeeDAO {
	
	public EmployeeInfo auth(int id,String password);
	public EmployeeInfo searchEmployee(int id);
	public boolean changePassword(int id,String password);
	public boolean registerEmployee(EmployeeInfo info);
}
