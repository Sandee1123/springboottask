<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>login</h1>
	${SPRING_SECURITY_LAST_EXCEPTION.message}
	<form action="login" method="post">
	<table>
	<tr>
	<td>username</td>
	<td><input type="text" name="username">
	
	</tr>
	<tr>
	<td>password</td>
	<td><input type="password" name="password">
	
	</tr>
	<tr>
	
	<td><input type="submit" name="" value="login">
	
	</tr>
	
	
	</table>
	
	
	</form>
</body>
</html>