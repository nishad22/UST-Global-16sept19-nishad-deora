package com.ust.empspringmvc.controller;

import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ust.empspringmvc.dto.EmployeeBean;
import com.ust.empspringmvc.service.IEmployeeService;

@Controller
public class EmployeeController {
	//	@RequestMapping(path="/hello")
	//	public String hello(ModelMap map) {
	//		map.addAttribute("msg", "Hello Nishad how are you");
	//		return "index";
	//	}
	@Autowired
	private IEmployeeService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format,true);
		binder.registerCustomEditor(Date.class, editor);

	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of login page

	@PostMapping("/login")
	public String login(int id,String password,HttpServletRequest req) {
		EmployeeBean bean = service.login(id, password);
		if(bean == null) {
			req.setAttribute("msg","Invalid Credentials");
			return "login";
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}

	}//end of login()

	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}//end of register

	@PostMapping("/register")
	public String register(EmployeeBean bean, ModelMap map) {
		int check = service.register(bean);
		if(check > 0) {
			map.addAttribute("msg","You are Registered "+check);
		} else {
			map.addAttribute("msg","Email is repeated");
		}
		return "login";
	}//end of register page
	@GetMapping("/home")
	public String home(ModelMap map,@SessionAttribute(name="bean",required = false)EmployeeBean bean) {
		if(bean==null) {
			map.addAttribute("msg","Login first!!!");
			return "login";
		}
		else {
			return "home";
		}
	}//end of home()

	@PostMapping("/home")
	public String home() {
		return "home";
	}//end of home()

	@GetMapping("/search")
	public String search(@RequestParam("id")int id,ModelMap map) {
		EmployeeBean bean = service.searchEmpolyee(id);
		if(bean==null) {
			map.addAttribute("msg", "Data not found");
		} else {
			map.addAttribute("bean",bean);
		}
		return "home";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return"/login";
	}//end of logout

	@GetMapping("/delete")
	public String deleteProfile(HttpSession session) { 
		EmployeeBean bean = (EmployeeBean)session.getAttribute("bean");

		
		
		try {
			service.deleteEmployee(bean.getId());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		session.invalidate();
		return "login";
	}//end of deleteprofile()

	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		if(session!=null) {
			return "changepassword";
		} else {
			return "login";
		}
	}//end of changepassword

	@PostMapping("/changepassword")
	public String changepassword(String password,String confirmpassword,
			@SessionAttribute(name="bean")EmployeeBean bean,ModelMap map) {
		if(password.equals(confirmpassword)) {
			service.changePassword(password,bean.getId());
			map.addAttribute("msg", "Password Changed");
		}else {
			map.addAttribute("msg","Password not matching");
		}
		//			changePassword(bean.getId(), password);
		return "home";
	}
	@GetMapping("/updateprofile")
	public String updateProfile(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		if(session!=null) {
			return "updateprofile";
		} else {
			return "login";
		}
	}
	
	@PostMapping("/updateprofile")
	public String updateprofile(String name,String email,Date doj,ModelMap map,
			@SessionAttribute(name="bean")EmployeeBean empbean) {
		empbean.setName(name);
		empbean.setEmail(email);
		empbean.setDoj(doj);
		service.updateEmployee(empbean);
		map.addAttribute("msg","Profile updated");
		return "home";
	}
}
