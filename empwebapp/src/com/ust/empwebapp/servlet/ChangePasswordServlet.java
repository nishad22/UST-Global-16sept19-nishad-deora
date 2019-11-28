package com.ust.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ust.empwebapp.dao.IEmployeeDAO;
import com.ust.empwebapp.dto.EmployeeInfo;
import com.ust.empwebapp.util.EmployeeDAOManager;
@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null) {
			String pass = req.getParameter("newpassword");
			String conPass = req.getParameter("confirmpassword");
			if(pass.contentEquals(conPass)) {
				EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");
				IEmployeeDAO dao = EmployeeDAOManager.getEmployeeDAO();	
				dao.changePassword(info.getId(), pass);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
				dispatcher.forward(req, resp);
			}else {
				PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<h3>Password not matching</h3>");
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("/chpass.html");
				dispatcher.include(req, resp);
				out.println("</html>");
			}
			
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
			dispatcher.forward(req, resp);
		}
	}
}