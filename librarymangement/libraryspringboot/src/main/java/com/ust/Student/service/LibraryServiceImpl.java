package com.ust.Student.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.Student.dto.BookBean;
import com.ust.Student.dto.BookIssue;
import com.ust.Student.dto.LibrerianBean;
import com.ust.Student.dto.StudentBean;
import com.ust.Student.repo.IBookIssueRepository;
import com.ust.Student.repo.IBookRepository;
import com.ust.Student.repo.ILibrarianRepository;
import com.ust.Student.repo.IStudentRepository;

@Service
public class LibraryServiceImpl implements ILibraryService{

	@Autowired
	private IBookIssueRepository issue;
	@Autowired
	private IStudentRepository student;
	@Autowired
	private IBookRepository book;
	@Autowired
	private ILibrarianRepository library;
	
	@Override
	public StudentBean loginStudent(String id, String password) {
		return student.login(id, password);
	}

	@Override
	public LibrerianBean loginLibrerian(String id, String password) {
		return library.login(id, password);
	}

	@Override
	public boolean registerStudent(StudentBean bean) {
		student.save(bean);
		return true;
	}

	@Override
	public boolean registerLibrerian(LibrerianBean bean) {
		library.save(bean);
		return true;
	}

	@Override
	public BookBean searchBook(int id) {
		return book.findById(id).get();
	}

	@Override
	public boolean addBook(BookBean bean) {
		book.save(bean);
		return true;
	}

	@Override
	public boolean updatebook(int id, String bname, String bauthor, String publication) {
		book.update(id, bname, bauthor, publication);
		return true;
	}

	@Override
	public boolean deletebook(int id) {
		book.deleteById(id);
		return true;
	}

	@Override
	public boolean request(String sid, int id) {
		StudentBean student = this.student.findById(sid).get();
		BookBean book = this.book.findById(id).get();
		//BookIssue bean = issue.requestBook(student, book);
		BookIssue bean = new BookIssue();
		bean.setIssueDate(new Date());
		bean.setBook(book);
		bean.setStudent(student);
		bean.setStatus("request");
		issue.save(bean);
		return true;
	}

	@Override
	public boolean respond(int id) {
		// TODO Auto-generated method stub
		Date d = new Date();
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(d);
		cal.add(Calendar.DATE,10);
		BookIssue bean = this.issue.findById(id).get();
		bean.setReturnDate(cal.getTime());
		bean.setStatus("accpet");
		issue.save(bean);
		return true;
	}

	@Override
	public boolean deleteRespond(int bid) {
		// TODO Auto-generated method stub
		issue.deleteById(bid);
		return true;
	}

	@Override
	public List<BookIssue> getResponse() {
		// TODO Auto-generated method stub
		return issue.findAll();
	}

}
