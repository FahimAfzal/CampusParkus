<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% 
	String name = request.getParameter("Name");
	String locationLat = request.getParameter("Latitude");
   	String locationLng = request.getParameter("Longitude");
%>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">
<link rel="stylesheet" href="CP.css" media="screen">
<title>CampusParkus :: View Directions</title>
</head>
<body>

<div align="center">
	<div id="map"></div>
	<div id="legend"><h3>Legend</h3></div>
	<div id="promptUser"></div>
	<form name="parkingLocation">
		<input type="hidden" name="latitude" value=<%= locationLat %> />
		<input type="hidden" name="longitude" value=<%= locationLng %> />
	</form>
	<button id="showMe" class="btn center-align">Use GPS Location</button><br><br>
	<button id="showInput" class="btn center-align">Enter Address</button>
    <form id="UserLocation" name="userLocation">
      <div class="input-field">
        <textarea class="input_fields materialize-textarea" id="address" type="text"></textarea>
        <label id="lblResult" class="active" for="address"><i>Enter complete address</i></label>
      </div>
    </form>

    <br><button id="getLocation" class="btn center-align">Get Location</button><br>
	<div id="logo"></div>
	<form action="CP_Home.jsp" method="post">
    	<input id="mySubmit" class="btn center-align" type="submit" value="Start Over" />
    </form><br>
    <form action="Support.jsp" method="post">
    	<input id="mySubmit" class="btn center-align" type="submit" value="Emergency/Support" />
    </form><br>
    <form action="ContactUs.jsp" method="post">
    	<input id="mySubmit" class="btn center-align" type="submit" value="Contact Us" />
    </form><br>
</div>

<script src="Directions_JS.js"></script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAZSUAjd5nuh5HADfctSIUJaGVzXL--lOw&libraries=places"></script>
<script type = "text/javascript">
google.maps.event.addDomListener(window, 'load', intilize);

</script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>
</body>
</html>