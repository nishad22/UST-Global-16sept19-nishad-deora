package com.ust.springboot.repo;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ust.springboot.dto.EmployeeBean;

//@Repository
public interface IEmployeeRepo extends JpaRepository<EmployeeBean, Integer>{
	@Transactional
	@Modifying
	@Query("update EmployeeBean set name=:name,password=:password,gender=:gender,doj=:doj where id=:id")
	public void update(String name,String password,String gender,Date doj,int id);
}
