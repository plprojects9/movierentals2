<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rented Movies</title>
<style>
	table {
		border-collapse: separate;
		border-spacing: 10px;
	}
	
	th {
		border: 1px solid black;
	}
</style>
</head>
<body>
	<h2>List of Rented Movies:</h2>
	<table>
		<tr>
			<th>Customer ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Rented Movie Name</th>
		</tr>
		<c:forEach items="${rentedmovies}" var="rentedmovie">
			<tr>
				<td>${rentedmovie.custid}</td>
				<td>${rentedmovie.fname}</td>
				<td>${rentedmovie.lname}</td>
				<td>${rentedmovie.rentedmoviename}</td>
			</tr>
		</c:forEach>
	</table>
<a href="home">Go to home page</a>
</body>
</html>