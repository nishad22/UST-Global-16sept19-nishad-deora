package com.ust.empspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.empspringmvc.dao.IEmployeeDAO;
import com.ust.empspringmvc.dto.EmployeeBean;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO dao;
	@Override
	public EmployeeBean login(int id, String password) {
		
		return dao.login(id, password);
	}

	@Override
	public int register(EmployeeBean bean) {
		//logic to check email and password
		return dao.register(bean);
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeeBean searchEmpolyee(int id) {
		// TODO Auto-generated method stub
		return dao.searchEmpolyee(id);
	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(bean);
	}

	@Override
	public boolean changePassword(String password, int id) {
		// TODO Auto-generated method stub
		return dao.changePassword(password, id);
	}

}
