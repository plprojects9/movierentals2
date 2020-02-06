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
	<h2>List of Rented & Non-Rented Movies:</h2>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Movie ID</th>
			<th>Rented Movie Name</th>
		</tr>
		<c:forEach items="${allmovies}" var="movie">
			<tr>
				<td>${movie.fname}</td>
				<td>${movie.lname}</td>
				<td>${movie.movieid}</td>
				<td>${movie.rentedmoviename}</td>
			</tr>
		</c:forEach>
	</table>
<a href="home">Go to home page</a>
</body>
</html>