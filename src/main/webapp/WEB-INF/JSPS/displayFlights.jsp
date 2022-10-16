<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flights</title>
</head>
<body>

	<h1>Display Flights</h1>

	<table>
		<tr>
			<th>sr</th>
			<th>Airline</th>
			<th>Departure City</th>
			<th>Arrival City</th>
			<th>Departure Time</th>
		</tr>

		<c:forEach items="${flights}" var="f" varStatus="s" >
			<tr>
				<td>${s.index+1}</td>	
				<td> ${f.getOperatingAirlines()} </td>
				<td> ${f.getDepartureCity()} </td>
				<td> ${f.getArrivalCity()} </td>
				<td> ${f.getEstimateDepartureTime()} </td>
				<td> <a href="showCompleteReservation?flightId=${f.getId()}" >Select</a> </td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>