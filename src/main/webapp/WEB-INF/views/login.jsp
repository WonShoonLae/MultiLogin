<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.center{
		margin: auto;
		width: 50%;
		border: 3px solid blue;
		padding: 10px;
	}
</style>
</head>
<body>
<div class="center">
	<h3>User Login</h3>
	<form method="POST" action="/user/login">
		User Name : <input type="text" name="username" value="user"/><br><br>
		Password  : <input type="password" name="password" value="password"/><br><br>
		<input type="submit" name="submit"/>
	</form>
</div>
</body>
</html>