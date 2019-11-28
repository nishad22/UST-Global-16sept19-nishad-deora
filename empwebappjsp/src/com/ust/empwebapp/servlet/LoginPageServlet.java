package com.ust.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}
		out.println("<html>");
		out.println("<body>");
		
		out.println("<form action='./login' method = 'post' style= ' width : 200px; height : 400px; margin-top:100px; margin-left:600px'>");
		out.println("id:<br> <input type='text' name='id' value='"+id+"'><br> <br>");
		out.println("password:<br> <input type='password' name='password'><br>");
		out.println("<br> <input type='checkbox' name='checkbox'>Remember Me<br>");
		out.println("<br> <input type='submit' value='login'> <br> <br>");
		out.println("<a href='register.html'>Register</a>");
		out.println("</form>");
		
		out.println("</body>");
		out.println("</html>");
		
	}
}
