<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="CP.css" media="screen">
<title>CampusParkus :: View All Structures/Lots</title>
<script>
	var markers = [<c:forEach var="location" items="${listLocations}">
		['<div id="iw-container">' +
		'<div class="iw-title">${location.parkName}</div>' +
		'<p />Type: ${location.parkType}<br>Address: ${location.parkAddress}<br>EV Charging Station: ${location.EV}</p>' +
		'<div class="iw-content">' +
		'<table border="1"/>' + 
		'<tr />' +
		'<td colspan=2 align="center" style="background-color:#FDC846"/>' +
		'<b />Student Prices</b>' +
		'</td></tr>' +
		'<tr /><td />OneCard</td>' +
		'<td />${location.studOCPrice}</td></tr>' +
		'<tr /><td />VISA/MC</td>' +
		'<td />${location.stfstudCreditPrice}</td></tr>' +
		'<tr /><td />Cash</td>' +
		'<td />${location.cashPrice}</td></tr>' +
		'</table>' +
		'<table />' + 
		'<tr />' +
		'<td colspan=2 align="center" style="background-color:#FDC846"/>' +
		'<b />Staff Prices</b>' +
		'</td></tr>' +
		'<tr /><td />OneCard</td>' +
		'<td />${location.staffOCPrice}</td></tr>' +
		'<tr /><td />VISA/MC</td>' +
		'<td />${location.stfstudCreditPrice}</td></tr>' +
		'<tr /><td />Cash</td>' +
		'<td />${location.cashPrice}</td></tr>' +
		'</table>' +
		'<table border="1"/>' + 
		'<tr />' +
		'<td colspan=2 align="center" style="background-color:#FDC846"/>' +
		'<b />Visitor Prices</b>' +
		'</td></tr>' +
		'<tr /><td />VISA/MC</td>' +
		'<td />${location.visitCreditPrice}</td></tr>' +
		'<tr /><td />Cash</td>' +
		'<td />${location.cashPrice}</td></tr>' +
		'</table>' +
		'<div align="center">' + 
		'<form action="ViewDirections.jsp" method="post">' +
		'<input type="hidden" name="Name" value="${location.parkName}" />' +
		'<input type="hidden" name="Latitude" value="${location.lat}" />' +
		'<input type="hidden" name="Longitude" value="${location.lng}" />' +
    	'<input id="mySubmit" type="submit" value="Go To ${location.parkName}" />' +
    	'</form>' +
		'</div></div></div>', '${location.lat}', '${location.lng}'], 
		</c:forEach>
	];	
	
	function MyLogoControl(controlDiv) {
	    controlDiv.style.padding = '5px';
	    var logo = document.createElement('IMG');
	    logo.src = 'campusparkus.png';
	    logo.style.opacity = 0.8;
	    logo.style.height = '75px';
	    logo.style.width = '75px';
	    logo.style.cursor = 'pointer';
	    controlDiv.appendChild(logo);

	    google.maps.event.addDomListener(logo, 'click', function() {
	        window.location = 'CP_Home.jsp'; 
	    });
	}
	
	function myMap() {
		var map = new google.maps.Map(document.getElementById("map"),
				{ center: { lat: 42.35806, lng: -83.07219 }, 
				  zoom: 15 });
		var infowindow = new google.maps.InfoWindow(), marker, i;
		
		for (i = 0; i < markers.length; i++) {
			marker = new google.maps.Marker({
				position: new google.maps.LatLng(markers[i][1], markers[i][2]),
				icon:"CP_MapMarker.png",
				map: map
			});
			
			google.maps.event.addListener(marker, 'click', (function(marker, i) {
		        return function() {
		        	map.setZoom(17);
		            infowindow.setContent(markers[i][0]);
		            infowindow.open(map, marker);
		        }
		    })(marker, i));
		}
		var logoControlDiv = document.createElement('DIV');
		var logoControl = new MyLogoControl(logoControlDiv);
		logoControlDiv.index = 0; 
		map.controls[google.maps.ControlPosition.TOP_RIGHT].push(logoControlDiv);
	}
</script>
</head>
<body>
<div align="center">
	<div id="map"></div>
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAZSUAjd5nuh5HADfctSIUJaGVzXL--lOw&callback=myMap"></script>

	<form action="CP_Home.jsp" method="post">
    	<input id="mySubmit" type="submit" value="Start Over" />
    </form><br>
    <form action="Support.jsp" method="post">
    	<input id="mySubmit" type="submit" value="Emergency/Support" />
    </form><br>
    <form action="ContactUs.jsp" method="post">
    	<input id="mySubmit" type="submit" value="Contact Us" />
    </form><br>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>
</body>
</html>