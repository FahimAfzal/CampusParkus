<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="CP.css" media="screen">
<link rel="stylesheet" href="ContactUS.css" media="screen">
<title>CampusParkus :: Contact Us</title>
</head>
<body>
	<div align="center">
	<div id="logo"></div>
	<h1>Contact Us</h1>
	<h2>Email us with any questions or concerns. <br>
	 We would be happy to answer your questions.</h2>
	 <h2 style="color: red;" >${failMessage}</h2>
	 
	 
	<form action="contactUSServlet" method="post" >
    <input name = "name" type ="text" class = "formContact" placeholder = "Your Name" required> <br>
     <input name = "email" type ="email" class = "formContact" placeholder = "Your Email" required> <br>
     
    <textarea name="message" placeholder = "Message" class = "formContact" rows="5" required></textarea> <br>
    
    <input type ="submit" name="submit" class = "formContact-submit" value ="SEND MESSAGE">
    </form>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>
</body>
</html>