package com.ust.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.springboot.dao.IEmployeeDAO;
import com.ust.springboot.dto.EmployeeBean;

//@Service
public class EmployeeService implements IEmployeeService{
//	@Autowired
	private IEmployeeDAO dao;

	@Override
	public boolean updateProfile(EmployeeBean bean) {
		// TODO Auto-generated method stub
		if(bean.getName()==null || bean.getPassword()==null) {
			return false;
		}else if(bean.getPassword().length()>8) {
			return false;
		}
		return dao.updateProfile(bean);
	}

	@Override
	public boolean addEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		if(bean.getName()==null || bean.getPassword()==null) {
			return false;
		}else if(bean.getPassword().length()>8) {
			return false;
		}
		return dao.addEmployee(bean);
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployee(id);
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

}
