<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<style>
	td{
		width: 50px;
	};
</style>
<body>

	<h1>User Login</h1>

	<form action="login" method="POST">

		<table>

		
			<tr>

				<td>Email : <input name="email" /></td>
			</tr>

			<tr>

				<td>Password : <input type="password" name="password" /></td>
			</tr>

		
			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>

	</form>

	<p>${ msg}</p>


</body>
</html>