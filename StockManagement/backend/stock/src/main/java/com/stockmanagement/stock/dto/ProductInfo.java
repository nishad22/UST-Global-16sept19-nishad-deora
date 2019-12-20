package com.stockmanagement.stock.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "product_info")
public class ProductInfo {
	@Column
	@Id
	@GeneratedValue
	private int product_id;
	@Column
	private String name;
	@Column
	private String category;
	@Column
	private String company;
	@Column
	private int quantity;
	@Column
	private double price;
	@JsonBackReference
	@Exclude
	@ManyToMany(cascade = CascadeType.PERSIST,mappedBy = "product")
	private List<OrderInfo> order;
	
}
