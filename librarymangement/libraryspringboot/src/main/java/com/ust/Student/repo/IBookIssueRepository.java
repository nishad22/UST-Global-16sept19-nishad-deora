package com.ust.Student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ust.Student.dto.BookBean;
import com.ust.Student.dto.BookIssue;
import com.ust.Student.dto.StudentBean;

public interface IBookIssueRepository extends JpaRepository<BookIssue, Integer>{
 
	@Query("from BookIssue where student=:rollno and book=:id")
	public BookIssue requestBook(StudentBean rollno , BookBean id);
}
