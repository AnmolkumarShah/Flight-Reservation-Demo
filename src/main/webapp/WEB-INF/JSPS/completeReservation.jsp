<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IcompleteReservation</title>
</head>
<body>

<h1>Complete Reservation</h1>

Airline ${flight.getOperatingAirlines()} <br>
Airline ${flight.getDepartureCity()} <br>
Airline ${flight.getEstimateDepartureTime()} <br>

<form action="completeReservation" method="post" >

<h3>Passanger Details</h3>

first name : <input type="text" name="firstName" /><br>
last name : <input type="text" name="lastName" /><br>
email : <input type="text" name="email" /><br>
phone : <input type="text" name="phone" /><br>

<input type="hidden" name="flightId" value="${flight.getId() }" >

<h3>Card Details</h3>

Name on card : <input type="text" name="nameOnTheCard" /><br>
Card number : <input type="text" name="cardNumber" /><br>
Expiry Date : <input type="text" name="expirationDate" /><br>
Three digit secure code : <input type="text" name="securityCode" /><br>

<input type="submit" value="Confirm" />

</form>




</body>
</html>