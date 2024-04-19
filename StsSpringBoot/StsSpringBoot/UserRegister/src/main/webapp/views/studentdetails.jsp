<%@page import="com.app.Model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentDetails</title>
</head>
<body>
	<%
	session = request.getSession(false);
		Student user = (Student) session.getAttribute("student");
	%>
	<h1>Information of Student</h1>
	<h1>
		Name:
		<%=user.getName()%></h1>
	<h1>
		City:
		<%=user.getCity()%></h1>
	<h1>
		Country:
		<%=user.getCountry()%></h1>
	<h1>
		Gender:
		<%=user.getGender()%></h1>
	<h1>
		Number:
		<%=user.getNumber()%></h1>
</body>
</html>