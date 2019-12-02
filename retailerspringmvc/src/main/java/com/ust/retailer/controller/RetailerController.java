package com.ust.retailer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ust.retailer.dao.RetailerBean;
import com.ust.retailer.service.IRetailerService;

import lombok.Getter;

@Controller
public class RetailerController {

//	@RequestMapping(path="/hello")
//	public String hello(ModelMap map) {
//		map.addAttribute("msg", "Hello Nishad how are you");
//		return "index";
//	}
	@Autowired
	private IRetailerService service;
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String loginpage(int rid,String password,HttpServletRequest req) {
		RetailerBean bean = service.login(rid, password);
		if(bean==null) {
			req.setAttribute("msg", "Invalid Credentials");
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("bean", bean);
		}
		return "home";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/register")
	public String registerpage(RetailerBean retailer,ModelMap map) {
		int check = service.register(retailer);
		if(check>0) {
			map.addAttribute("msg","you are registered");
		} else {
			map.addAttribute("msg","id repeated");
		}
		return "login";
	}
	
	@GetMapping("/home")
	public String home(ModelMap map,@SessionAttribute(name="bean",required = false)RetailerBean bean) {
		if(bean==null) {
			map.addAttribute("msg","Login first!!!");
			return "login";
		}
		else {
			return "home";
		}
	}
	
	@PostMapping("/home")
	public String homepage() {
		return "home";
	}
}

