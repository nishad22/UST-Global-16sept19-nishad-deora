package com.ust.retailer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.retailer.dao.OrderBean;
import com.ust.retailer.dao.ProductBean;
import com.ust.retailer.dao.RetailerBean;
import com.ust.retailer.dto.IRetailerDAO;
@Service
public class RetailerServiceImpl implements IRetailerService{

	@Autowired
	private IRetailerDAO dao;
	@Override
	public RetailerBean login(int id , String password) {
		// TODO Auto-generated method stub
		return dao.login(id,password);
	}

	@Override
	public int register(RetailerBean retailer) {
		// TODO Auto-generated method stub
		return dao.register(retailer);
	}

	@Override
	public ProductBean searchProduct(int id) {
		// TODO Auto-generated method stub
		return dao.searchProduct(id);
	}

	@Override
	public boolean updatePassword(String password, int id) {
		// TODO Auto-generated method stub
		return dao.updatePassword(password,id);
	}

	@Override
	public int calAmount(int price, int quantity) {
		// TODO Auto-generated method stub
		return dao.calAmount(price, quantity);
	}

	@Override
	public OrderBean searchOrder(int id) {
		// TODO Auto-generated method stub
		return dao.searchOrder(id);
	}

}
