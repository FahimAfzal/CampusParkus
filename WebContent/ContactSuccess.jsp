<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="CP.css" media="screen">
<title>CampusParkus :: Home Page</title>
</head>
<body>
	<div align="center">
	<h2>Comment/Feedback successfully submitted</h2>
	<div id="logo"></div>
	<h3>What would you like to do now?</h3>
	<form action="TierSelect.jsp" method="post">
    	<input id="mySubmit" type="submit" value="Find Parking" />
    </form><br>
	<form action="TierServlet" method="post">
    	<input type="hidden" name="LoadSpecificTierValue" value="ViewAll" />
    	<input id="mySubmit" type="submit" value="View All Parking" />
    </form><br>
    <form action="Support.jsp" method="post">
    	<input id="mySubmit" type="submit" value="Emergency/Support" />
    </form><br>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>
</body>
</html>