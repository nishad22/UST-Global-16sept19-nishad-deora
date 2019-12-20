package com.stockmanagement.stock.dao;

import java.util.List;

import com.stockmanagement.stock.dto.ProductInfo;


public interface IStockDAO {
	public boolean addProduct(ProductInfo bean);
	public boolean updateProductInfo(int id,String name,String category,
			String company,int quantity,double price);
	public List<ProductInfo> findByName(String name);
	public List<ProductInfo> findByCompany(String company);
	public List<ProductInfo> findByCategory(String category);
	public boolean addToCart(int pid);
//	public boolean totalBill();
}
