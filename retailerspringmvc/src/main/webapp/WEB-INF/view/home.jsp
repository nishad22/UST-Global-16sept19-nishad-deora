<%@page import="com.ust.retailer.dao.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	RetailerBean retailer = (RetailerBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>

	<a href="./changepassword">update Password</a>
	<a href="#">search product</a>
	<a href="#">search order</a>
	<a href="#" style="float: right;">Logout</a>
	<h2>Welcome<%=retailer.getName()%></h2>
		
		
	<fieldset>
		<legend>Search Product</legend>
		<form action="./search">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="search"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%-- <%
		EmployeeBean empBean = (EmployeeBean) request.getAttribute("bean");
	%>
	<%
		if (empBean != null) {
	%>
	<table>
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Gender</th>
			<th>DOJ</th>
		</tr>

		<tr>
			<td><%=empBean.getName()%></td>
			<td><%=empBean.getEmail()%></td>
			<td><%=empBean.getGender()%></td>
			<td><%=empBean.getDoj()%></td>
		</tr>
	</table>
	<%
		} --%>
	<!-- %> -->
	<h3>${msg}</h3>
</body>
</html>