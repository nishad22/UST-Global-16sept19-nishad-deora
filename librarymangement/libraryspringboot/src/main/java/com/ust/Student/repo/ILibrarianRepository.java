package com.ust.Student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ust.Student.dto.LibrerianBean;

public interface ILibrarianRepository extends JpaRepository<LibrerianBean, String>{

	@Query("from LibrerianBean where libid=:libid and password=:password")
	public LibrerianBean login(String libid,String password);
}
