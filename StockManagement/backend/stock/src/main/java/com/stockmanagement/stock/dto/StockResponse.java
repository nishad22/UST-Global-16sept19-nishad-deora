package com.stockmanagement.stock.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class StockResponse {
	private String message;
	private String description;
	private int statusCode;
	private List<ProductInfo> product;
}
