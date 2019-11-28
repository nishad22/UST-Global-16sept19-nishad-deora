<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class = "java.lang.String" scope="request"/>
<%
String id = "";
Cookie[] cookies = request.getCookies();
if(cookies!=null) {
	for(Cookie cookie : cookies) {
		if(cookie.getName().equals("alwaysRemember")) {
			id = cookie.getValue();
		}
	}
}
%>
<body>
<h4><%=msg %></h4>
<form action='./login' method = 'post' style= ' width : 200px; height : 400px; margin-top:100px; margin-left:600px'>
		id:<br> <input type='text' name='id' value='<%=id%>'><br> <br>
		password:<br> <input type='password' name='password'><br>
		<br> <input type='checkbox' name='checkbox'>Remember Me<br>
		<br> <input type='submit' value='login'> <br> <br>
		<a href='register.html'>Register</a>
		</form>
</body>
</html>