package com.ust.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.springboot.dto.EmployeeBean;
import com.ust.springboot.repo.IEmployeeRepo;

@Service
public class EmployeeServiceJpaImpl implements IEmployeeService{

	@Autowired
	private IEmployeeRepo repo;
	@Override
	public boolean updateProfile(EmployeeBean bean) {
		// TODO Auto-generated method stub
		repo.update(bean.getName(), bean.getPassword(), bean.getGender(), bean.getDoj(), bean.getId());
		return true;
	}

	@Override
	public boolean addEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		repo.save(bean);
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		//EmployeeBean bean = repo.findById(id).get();
		//repo.delete(bean);
		repo.deleteById(id);
		return true;
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
