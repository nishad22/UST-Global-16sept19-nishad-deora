package com.stockmanagement.stock.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@Table(name = "order_info")
public class OrderInfo {
	@Column
	@Id
	@GeneratedValue
	private int order_id;
	@Column
	private double total_price;
	@Column
	private double	price_gst;
	
//	@ManyToMany(name="order_history_info",joinColumns = @JoinColumn(name="sid"),
//			inverseJoinColumns = @JoinColumn(name="cid")
	@JsonBackReference
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "order_history_info",joinColumns = @JoinColumn(name="sid"),
		inverseJoinColumns = @JoinColumn(name="cid"))
	private List<ProductInfo> product;
}
