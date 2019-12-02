package com.ust.retailer.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class OrderBean {
	@Id
	@Column
	private int oid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pid",nullable = false)
	private ProductBean productBean;
	@Column
	@JoinColumn(name="price",nullable = false)
	private double price;
	
	private int quantity;
	@Column
	private double amountPay;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rid",nullable = false)
	private RetailerBean retailerBean;

}
