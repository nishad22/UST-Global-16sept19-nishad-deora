package com.ust.retailer.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class RetailerBean {
	@Id
	@Column
	private int rid;
	@Column
	private String name;
	@Column
	private String password;
}
