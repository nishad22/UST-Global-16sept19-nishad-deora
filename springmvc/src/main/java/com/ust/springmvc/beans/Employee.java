package com.ust.springmvc.beans;

import java.util.Date;

public class Employee {
	private String name;
	private String password;
	private String gender;
	private int id;
	private Date obj;
	public Date getObj() {
		return obj;
	}
	public void setObj(Date obj) {
		this.obj = obj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
