package com.stockmanagement.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockmanagement.stock.dao.IStockDAO;
import com.stockmanagement.stock.dto.ProductInfo;

@Service
public class StockServiceImpl implements IStockService{

	@Autowired
	private IStockDAO dao;
	@Override
	public boolean addProduct(ProductInfo bean) {
		// TODO Auto-generated method stub
		return dao.addProduct(bean);
	}

	@Override
	public boolean updateProductInfo(int id, String name, String category, String company, int quantity, double price) {
		// TODO Auto-generated method stub
		return dao.updateProductInfo(id, name, category, company, quantity, price);
	}

	@Override
	public List<ProductInfo> findByName(String name) {
		// TODO Auto-generated method stub
		return dao.findByName(name);
	}

	@Override
	public List<ProductInfo> findByCompany(String comp) {
		// TODO Auto-generated method stub
		return dao.findByCompany(comp);
	}

	@Override
	public List<ProductInfo> findByCategory(String category) {
		// TODO Auto-generated method stub
		return dao.findByCategory(category);
	}

	@Override
	public boolean addToCart(int pid) {
		// TODO Auto-generated method stub
		return dao.addToCart(pid);
	}

//	@Override
//	public boolean totalBill() {
//		// TODO Auto-generated method stub
//		return dao.totalBill();
//	}

}
