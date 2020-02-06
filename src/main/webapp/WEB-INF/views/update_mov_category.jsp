<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Movie</title>
</head>
<body>
	<h2>Update a movie category:</h2>
	<form action="updatemovie" method="post">
		<table>
			<tr> 
				<td> <label>Movie ID:</label></td> 
				<td> <input type=text name=id> </td>
			</tr>
			<tr>
				<td> <label>Movie Category:</label> </td>
				<td> <input type=text name=category> </td>
			</tr>
			<tr>
				<td> </td>
				<td> <input type=submit value="Update Movie"> </td>
			</tr>
		</table>
	</form>
	${msg}
	<br>
	<a href="home">Go to home page</a>
</body>
</html>