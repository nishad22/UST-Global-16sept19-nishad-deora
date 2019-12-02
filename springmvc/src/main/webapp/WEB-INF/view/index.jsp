<%
	String s = (String) request.getAttribute("msg");
String s1 = (String) request.getAttribute("name");
String s2 = (String) request.getAttribute("id");
%>
<html>
<body>
	<h2 style="color: red;">${msg}</h2>
	<h2 style="color: green;"><%=s%></h2>
	<h2 style="color: orange;">${name}</h2>
	<h2 style="color: pink;">${id}</h2>
</body>
</html>
