package com.stockmanagement.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stockmanagement.stock.dto.ProductInfo;
import com.stockmanagement.stock.dto.StockResponse;
import com.stockmanagement.stock.service.StockServiceImpl;


@CrossOrigin(origins = "*", allowedHeaders = "*" , allowCredentials = "true")
@RestController
public class StockController {

	@Autowired
	private StockServiceImpl service;
	@Autowired
	private StockResponse response;

	@PostMapping(path="/addproduct", consumes =MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse addProduct(@RequestBody ProductInfo info) {
		if(service.addProduct(info)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("New Stock Added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Stock Full");
		}
		return response;
	}
	@PutMapping(path = "/updateproduct",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse updateProduct(@RequestParam("id")int id,@RequestParam("name")String name,
			@RequestParam("category")String category,@RequestParam("company")String company,
			@RequestParam("quantity")int quantity, @RequestParam("price")double price) {
		if(service.updateProductInfo(id, name, category, company, quantity, price)) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Stock information updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product Not Exist");
		}
		return response;
	}
	@GetMapping(path="/findbyname",produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse findByName(@RequestParam("name")String name) {
		List<ProductInfo> info = service.findByName(name);
		if(info!=null) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("product found");
			response.setProduct(info);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("product not found");
		}
		return response;
	}
	
	@PostMapping(path="/findbycompany",produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse findByCompany(@RequestParam("company")String company) {
		List<ProductInfo> info = service.findByCompany(company);
		if(info!=null) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("product found");
			response.setProduct(info);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("product not found");
		}
		return response;
	}
	@PostMapping(path="/findbycategory",produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse findByCategory(@RequestParam("category")String category) {
		List<ProductInfo> info = service.findByCategory(category);
		if(info!=null) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("product found");
			response.setProduct(info);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("product not found");
		}
		return response;
	}

	@PostMapping(path = "/addtocart",produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse addToCart(@RequestParam("id")int pid) {
		if(service.addToCart(pid)) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("order placed");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("order not placed");
		}
		return response;
	}
	
//	@GetMapping(path="/totalbill",produces = MediaType.APPLICATION_JSON_VALUE)
//	public StockResponse totalBill() {
//		if(service.totalBill()) {
//			response.setStatusCode(200);
//			response.setMessage("Success");
//			response.setDescription("Pay Bill");
//		} else {
//			response.setStatusCode(401);
//			response.setMessage("Failure");
//			response.setDescription("Wait for Bill");
//		}
//		return response;
//	}
	

}
