<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

	<h1>User Registration</h1>

	<form:form action="register" modelAttribute="newUser" method="POST">

		<table>

			<tr>

				<td>First Name : <form:input path="firstName" /></td>
			</tr>

			<tr>

				<td>Last Name : <form:input path="lastName" /></td>
			</tr>

			<tr>

				<td>Email : <form:input path="email" /></td>
			</tr>

			<tr>

				<td>Password : <form:input type="password" path="password" /></td>
			</tr>

			<tr>

				<td>Confirm Password : <form:input type="password" path="password"
						name="confirm_password" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>

	</form:form>



</body>
</html>