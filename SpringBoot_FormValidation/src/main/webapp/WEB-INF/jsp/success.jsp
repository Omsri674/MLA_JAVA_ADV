<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/function" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success...</title>
</head>
<body>

	<h1 style="justify-content: center;">Your data is submmited
		succesfully...</h1>

	FIRSTNAME: ${user.fname}
	<br>
	<br> LASTNAME: ${user.lname}
	<br>
	<br> GENDER: ${user.gender}
	<br>
	<br> DATE: ${user.startDate}
	<br>
	<br> FOOD:
	<ul>
		<core:forEach var="food" items="${user.food}">
			<li>${food}</li>
		</core:forEach>
	</ul>
	<br>
	<br> FROM: ${user.cityfrom}
	<br>
	<br> TO: ${user.cityto}
	<br>
	<br>SEAT:
	<ul>
		<core:forEach var="s" items="${user.seat}">
			<li>${s}</li>
		</core:forEach>
	</ul>

<a href="form">click here for booking another ticket</a>

</body>
</html>