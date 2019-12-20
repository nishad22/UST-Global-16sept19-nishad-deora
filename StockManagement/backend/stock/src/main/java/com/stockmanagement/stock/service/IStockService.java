package com.stockmanagement.stock.service;

import java.util.List;

import com.stockmanagement.stock.dto.ProductInfo;

public interface IStockService {
	public boolean addProduct(ProductInfo bean);
	public boolean updateProductInfo(int id,String name,String category,
			String company,int quantity,double price);
	public List<ProductInfo> findByName(String name);
	public List<ProductInfo> findByCompany(String comp);
	public List<ProductInfo> findByCategory(String category);
	public boolean addToCart(int pid);
//	public boolean totalBill();
}
