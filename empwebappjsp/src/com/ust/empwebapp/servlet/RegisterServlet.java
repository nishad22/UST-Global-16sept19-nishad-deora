package com.ust.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.empwebapp.dao.IEmployeeDAO;
import com.ust.empwebapp.dto.EmployeeInfo;
import com.ust.empwebapp.util.EmployeeDAOManager;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("userid"));
		String name = req.getParameter("username");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String msg = "";
		EmployeeInfo info = new EmployeeInfo();
		info.setId(id);
		info.setName(name);
		info.setEmail(email);
		info.setPassword(password);
		
		IEmployeeDAO dao = EmployeeDAOManager.getEmployeeDAO();
		boolean check = dao.registerEmployee(info);
		
	PrintWriter out = resp.getWriter();

		if(check) {
			msg = "Registration completed";
//			out.println("<html>");
//			out.println("<h4>Registration completed</h4>");
//			out.println("</html>");
		}else {
			msg = "Id cannot be repeated";
//			out.println("<html>");
//			out.println("<h4>Id cannot be repeated</h4>");
//			out.println("</html>");
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.include(req, resp);
	}
}
