<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./form" method="post"
		style='width: 200px; height: 400px; margin-top: 100px; margin-left: 600px'>

		id:<br> <input type="text" name="id" placeholder="Enter id"><br>
		<br>
		name:<br> <input type="text" name="name" placeholder="Enter name"><br>
		<br>
		password:<br> <input type="password" name="password" placeholder="Enter password"><br> 
			<br>
		gender:<br> 
		<input type="radio" name="gender">Male<br> 
		<input type="radio" name="gender">Female<br> 
		<input type="radio" name="gender">Others<br>
		<br>
		DOJ:
		<input type="date" name="obj"><br>
		<br>
		<input type="submit" name="submit">
	</form>
</body>
</html>