<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="CP.css" media="screen">
<title>CampusParkus :: Student</title>
</head>
<body>
	<div align="center">
	<h2>Welcome WSU Students</h2>
	<div id="logo"></div>
	<%
		String count = (String)request.getAttribute("count");
	%>
	<h1><%=count%>&nbsp;locations found</h1>
	<h3>Select Parking Type</h3>
	<form action="StudentServlet" method="post">
    	<input type="hidden" name="LoadStudentValue" value="CCStructure" />
    	<input id="mySubmit" type="submit" value="Parking Structure" />
    </form><br>
    <form action="StudentServlet" method="post">
    	<input type="hidden" name="LoadStudentValue" value="CCLot" />
    	<input id="mySubmit" type="submit" value="Parking Lot" />
    </form><br>
    <form action="StudentServlet" method="post">
    	<input type="hidden" name="LoadStudentValue" value="CCBoth" />
    	<input id="mySubmit" type="submit" value="Lots & Structures" />
    </form><br>
    <h3>To stop the search and view the current selections<br>Click View List or View Map</h3>
    <form action="MapListServlet" method="post">
    	<input type="hidden" name="LoadMapValue" value="StfStudCCList" />
    	<input id="mySubmit" type="submit" value="View List" />
    </form><br>
    <form action="MapListServlet" method="post">
    	<input type="hidden" name="LoadMapValue" value="StfStudCCMap" />
    	<input id="mySubmit" type="submit" value="View Map" />
    </form><br>
	</div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>
</body>
</html>