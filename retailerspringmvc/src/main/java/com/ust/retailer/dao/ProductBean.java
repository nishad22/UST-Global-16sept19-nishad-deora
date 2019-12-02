package com.ust.retailer.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class ProductBean {
	
	@Column
	@Id
	private int pid;
	@Column
	private String pname;
	@Column
	private  int pquantity;
	@Column
	private double price;
}
