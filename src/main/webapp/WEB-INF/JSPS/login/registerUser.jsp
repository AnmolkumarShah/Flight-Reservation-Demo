<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>

	<form:form action="registerUser" method="POST" >

		<table>

			<tr>
				First Name :
				<td><form:input path="firstName" name="firstName" /></td>
			</tr>

			<tr>
				Last Name :
				<td><form:input path="lastName" name="lastName" /></td>
			</tr>

			<tr>
				Email :
				<td><form:input path="email" name="email" /></td>
			</tr>

			<tr>
				Password :
				<td><form:input path="password" name="password" /></td>
			</tr>
			
			<tr>
				Confirm Password :
				<td><form:input path="password" name="confirm_password" /></td>
			</tr>
			
			<tr>
				<td><form:input type="submit" value="Register" /></td>
			</tr>
		</table>

	</form:form>



</body>
</html>