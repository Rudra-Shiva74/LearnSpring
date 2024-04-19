<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>Hello This is index page</h1>
	<a href="about">about</a>
	<form action="employees" method="post">
		<input type="number" placeholder="Enter your id" name="id"> <input
			name="name" type="text" placeholder="Enter your name"><input
			type="text" name="sallary" placeholder="Enter your sallary">
		<input name="email" type="text" placeholder="Enter your Email"><input
			type="text" name="position" placeholder="Enter your position">
		<input type="submit" value="submit">
	</form>
</body>
</html>