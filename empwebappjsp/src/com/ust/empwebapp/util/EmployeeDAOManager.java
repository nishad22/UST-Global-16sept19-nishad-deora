package com.ust.empwebapp.util;

import com.ust.empwebapp.dao.EmployeeDAOJdbcImpl;
import com.ust.empwebapp.dao.IEmployeeDAO;

public class EmployeeDAOManager {
	private EmployeeDAOManager() {}
	public static IEmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOJdbcImpl();
	}
}
