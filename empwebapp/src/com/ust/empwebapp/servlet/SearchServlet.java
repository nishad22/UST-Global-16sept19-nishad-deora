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
@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		if(session == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("./login.html");
			dispatcher.forward(req, resp);
		}
		int id = Integer.parseInt(req.getParameter("search"));
		IEmployeeDAO dao = EmployeeDAOManager.getEmployeeDAO();
		EmployeeInfo info = dao.searchEmployee(id);
		PrintWriter out = resp.getWriter();
		if(info!=null) {
			out.println("<html>");
			out.println("<body>");
			out.println("<a href = './home'>Home</a>");
			out.println("<a style = 'float:right' href = './logout'>Logout</a>");
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>ID</th>");
			out.println("<th>Name</th>");
			out.println("<th>Email</th>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<th>"+info.getId()+"</th>");
			out.println("<th>"+info.getName()+"</th>");
			out.println("<th>"+info.getEmail()+"</th>");
			out.println("</tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		}
		else {
			out.println("NO data found");
		}
		
	}
}
