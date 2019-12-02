package com.ust.springmvc.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ust.springmvc.beans.Employee;

@Controller
public class HelloController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}
	@RequestMapping(path = "/hello")
	public String hello(@RequestParam("name") String name,
						@RequestParam("id") int id,
						ModelMap map) {
		map.addAttribute("msg","Hello World");
		map.addAttribute("name",name);
		map.addAttribute("id", id);
		return "index";
	}
	
	@RequestMapping(path = "/hi/{name}/{id}")
	public String hi(@PathVariable("name") String name,//PathParam
					@PathVariable("id") int id,
					ModelMap map) {
		map.addAttribute("msg", "Hello Spring framework");
		map.addAttribute("name",name);
		map.addAttribute("id",id);
		return "index";//logical view name(the name of JSP file) here dispatcherservelet doesnt know full name
	}
	
	@RequestMapping(path = "/form") //bydefault it accept as a doget method
	public String formpage() {
		return "form";
	}
	
	/*
	 * for normal jsp execution
	 * @RequestMapping(path = "/form",method=RequestMethod.POST) public String
	 * form(int id, String name,String password,String gender,ModelMap map) {
	 * map.addAttribute("id",id); map.addAttribute("name",name);
	 * map.addAttribute("password", password); map.addAttribute("gender", gender);
	 * return "formoutput"; }
	 */
	
	@RequestMapping(path = "/form",method=RequestMethod.POST)
	public String form(Employee emp,ModelMap map) {
		map.addAttribute("id",emp.getId());
		map.addAttribute("name",emp.getName());
		map.addAttribute("password",emp.getPassword());
		map.addAttribute("gender",emp.getGender());
		map.addAttribute("DOJ",emp.getObj());
		return "formoutput";
	}
	
	@RequestMapping(path = "/create-cookie")
	public String createCookie(ModelMap map,HttpServletResponse response) {
		
		Cookie cookie = new Cookie("name","Ashish");
		response.addCookie(cookie);
		return "createcookie";
	}
	
	@RequestMapping(path="/read-cookie")
	public String readCookie(@CookieValue(name="name",required = false)String name,ModelMap map) {
		map.addAttribute("name",name);
		return "readcookie";
	}
	
	@RequestMapping(path = "/redirect")
	public String redirect() {
		return "redirect: https://www.google.com";
	}
	
	@RequestMapping(path = "/forward")
		public String forward() {
			return "forward:hi/Nishad/1";
		}
	}
	

