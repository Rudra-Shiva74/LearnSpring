<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

	<a href="editstudent">View Student</a>
	<form action="studentdetail" method="post">
		<input type="text" placeholder="Enter your name" name="name"><br>
		<input type="text" placeholder="Enter your city" name="city"><br>
		<input type="text" placeholder="Enter your country" name="country"><br>
		<input type="radio" value="Male" name="gender">Male <input
			type="radio" value="Female" name="gender">Female <br> <input
			type="number" placeholder="Enter your number" name="number"><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>