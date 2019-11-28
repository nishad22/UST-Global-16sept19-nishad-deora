<%@page import="com.ust.empwebapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:useBean id="info" class="com.ust.empwebapp.dto.EmployeeInfo"
	scope="request"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
EmployeeInfo emp = (EmployeeInfo)request.getAttribute("info");

%>
<body>
	<a href='./home'>Home</a>
	<a style='float: right' href='./logout'>Logout</a>
	<%if(info!=null){ %>
	
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
		</tr>
		<tr>
			<th><%=emp.getId()%></th>
			<th><%=emp.getName()%></th>
			<th><%=emp.getEmail()%></th>
		</tr>
	</table>
	<%} %><%else { %>
	<h1>No data found</h1>
	<%} %>
</body>
</html>