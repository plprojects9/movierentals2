<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Movie</title>
</head>
<body>
	<h2>Add a new movie:</h2>
	<form action="addmovie" method="post">
		<table>
			<tr> 
				<td> <label>Movie Name:</label></td> 
				<td> <input type=text name=title> </td>
			</tr>
			<tr>
				<td> <label>Movie Category:</label> </td>
				<td> <input type=text name=category> </td>
			</tr>
			<tr>
				<td> </td>
				<td> <input type=submit value="Add Movie"> </td>
			</tr>
		</table>
	</form>
	${msg}
	<br>
	<a href="home">Go to home page</a>

</body>
</html>