<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="CP.css" media="screen">
<title>CampusParkus :: Staff</title>
</head>
<body>
	<div align="center">
	<h2>Welcome WSU Staff</h2>
	<div id="logo"></div>
	<%
		String count = (String)request.getAttribute("count");
	%>
	<h1><%=count%>&nbsp;locations found</h1>
	<h3>Do you need an EV charger?</h3>
	<form action="StaffServlet" method="post">
    	<input type="hidden" name="LoadStaffValue" value="OCBEV" />
    	<input id="mySubmit" type="submit" value="Yes" />
    </form><br>
    <form action="StaffServlet" method="post">
    	<input type="hidden" name="LoadStaffValue" value="OCBNoEV" />
    	<input id="mySubmit" type="submit" value="No" />
    </form><br>
    <h3>To stop the search and view the current selections<br>Click View List or View Map</h3>
    <form action="MapListServlet" method="post">
    	<input type="hidden" name="LoadMapValue" value="StaffOCBList" />
    	<input id="mySubmit" type="submit" value="View List" />
    </form><br>
    <form action="MapListServlet" method="post">
    	<input type="hidden" name="LoadMapValue" value="StaffOCBMap" />
    	<input id="mySubmit" type="submit" value="View Map" />
    </form><br>
	</div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>
</body>
</html>