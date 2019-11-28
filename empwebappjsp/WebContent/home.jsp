<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id = "info"  class = "com.ust.empwebapp.dto.EmployeeInfo" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<h1>Welcome<%=info.getName() %></h1>	
			<br>
			<a href='./search.html'>Search</a><br>");
			<br>
			<a href='./chpass.jsp'>Change Password</a><br>
			<br>
			<a href='./logout'>Logout</a><br>
</body>
</html>