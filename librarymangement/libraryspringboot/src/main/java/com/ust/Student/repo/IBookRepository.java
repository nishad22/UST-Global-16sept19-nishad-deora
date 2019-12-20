package com.ust.Student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ust.Student.dto.BookBean;

public interface IBookRepository extends JpaRepository<BookBean, Integer>{
	
	@Transactional
	@Modifying
	@Query("update BookBean set bname=:bname,bauthor=:bauthor,publication=:publication where id=:id")
	public void update(int id, String bname, String bauthor, String publication);
}
