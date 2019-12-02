package com.ust.retailer.dto;

import com.ust.retailer.dao.OrderBean;
import com.ust.retailer.dao.ProductBean;
import com.ust.retailer.dao.RetailerBean;

public interface IRetailerDAO {
	public RetailerBean login(int id , String password);
	public int register(RetailerBean retailer);
	public ProductBean searchProduct(int id);
	public boolean updatePassword(String password,int id);
	public int calAmount(int price ,int quantity);
	public OrderBean searchOrder(int id);
}
