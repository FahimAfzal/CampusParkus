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
</head>
<body>
<div align="center">
	<div id="logo"></div>
	<table border="1" cellpadding="3" bgcolor="#FEE3A0">
    	<tr>
    		<td colspan=3 align="center" style="background-color:#FDC846">
                    <h3>All Parking Lots & Structures</h3>
   			</td>
      	</tr>
        <tr style="font-size:14px;">
        	<td style="text-align:center;"><b>Parking Unit</b></td>
            <td style="text-align:center;"><b>Unit Address</b></td>
            <td style="text-align:center;"><b>Details</b></td>
      	</tr>
      	
<%	int count = 0;%>

		<c:forEach var="location" items="${listLocations}">

<%      	String color = "#FEE3A0";
        	
			if ((count % 2) == 0) {
				color = "#FDC846";
			}
          	
       		count++;            
%>

     	<tr style="background-color:<%=color%>; font-size:12px;">
            <td><c:out value="${location.parkName}" /></td>
            <td><c:out value="${location.parkAddress}" /></td>
            <td><button class="openmodal myBtn">More Information</button>
            	<div class="modal myModal">
            		<div class="modal-content" align="center">
            			<span class="close">&times;</span>
            			<div class="iw-title">${location.parkName}</div>
            			<p>Type: ${location.parkType}<br>Address: ${location.parkAddress}<br>EV Charging Station: ${location.EV}</p>
            			<table border="1">
            				<tr>
            					<td colspan=2 align="center" style="background-color:#FDC846"><b>Student Prices</b></td>
            				</tr>
            				<tr>
            					<td>OneCard</td>
            					<td>${location.studOCPrice}</td>
            				</tr>
            				<tr>
            					<td>VISA/MC</td>
            					<td>${location.stfstudCreditPrice}</td>
            				</tr>
            				<tr>
            					<td>Cash</td>
            					<td>${location.cashPrice}</td>
            				</tr>
            			</table>
            			
            			<table border="1">
            				<tr>
            					<td colspan=2 align="center" style="background-color:#FDC846"><b>Staff Prices</b></td>
            				</tr>
            				<tr>
            					<td>OneCard</td>
            					<td>${location.staffOCPrice}</td>
            				</tr>
            				<tr>
            					<td>VISA/MC</td>
            					<td>${location.stfstudCreditPrice}</td>
            				</tr>
            				<tr>
            					<td>Cash</td>
            					<td>${location.cashPrice}</td>
            				</tr>
            			</table>
            			
            			<table border="1">
            				<tr>
            					<td colspan=2 align="center" style="background-color:#FDC846"><b>Visitor Prices</b></td>
            				</tr>
            				<tr>
            					<td>VISA/MC</td>
            					<td>${location.visitCreditPrice}</td>
            				</tr>
            				<tr>
            					<td>Cash</td>
            					<td>${location.cashPrice}</td>
            				</tr>
            			</table>
            			<form action="ViewDirections.jsp" method="post">
            				<input type="hidden" name="Name" value="${location.parkName}" />
							<input type="hidden" name="Latitude" value="${location.lat}" />
							<input type="hidden" name="Longitude" value="${location.lng}" />
    						<input id="mySubmit" type="submit" value="Go To ${location.parkName}" />
    	    			</form>
            		</div>
            	</div>
            </td>
   		</tr>
        </c:forEach>
	</table>
	
	<script>
		var modals = document.getElementsByClassName("modal");
		
		var btns = document.getElementsByClassName("openmodal");
		var spans = document.getElementsByClassName("close");
		
		for(let i = 0; i < btns.length; i++) {
			btns[i].onclick = function() {
				modals[i].style.display = "block";
			}
		}
		
		for(let i = 0; i < spans.length; i++) {
			spans[i].onclick = function() {
				modals[i].style.display = "none";
			}
		}
		
		// This needs work!!!
		// The function should close an open modal when clicking
		// anywhere outside the modal.
		window.onclick = function(event) {
			for(let i = 0; i < modals.length; i++) {
				if (event.target === modals[i]) {
					modals[i].style.display = "none";
				}
			}
		}
	</script>
	
	<form action="TierSelect.jsp" method="post">
    	<input id="mySubmit" type="submit" value="Find Parking" />
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