package com.ust.Student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ust.Student.dto.StudentBean;

public interface IStudentRepository extends JpaRepository<StudentBean, String>{

	@Query("from StudentBean where rollno=:rollno and password=:password")
	public StudentBean login(String rollno , String password);
}
