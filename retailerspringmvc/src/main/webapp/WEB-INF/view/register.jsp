<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Register Page</legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" name="rid"></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				
				<tr>
					<td><input type="reset" value="reset"></td>
					<td><input type="submit" value="submit"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a hidden="./login">Click here to login</a>
</body>
</html>