const promptUser = document.getElementById('promptUser');
promptUser.innerHTML = "Would you like to use GPS or input a custom address?<br><br>";

const mapArea = document.getElementById('map');
mapArea.style.display = "none";

const legendArea = document.getElementById('legend');
legendArea.style.display = "none";

const $ = id => document.getElementById(id);

const useGPSBtn = document.getElementById('showMe');
const useInputBtn = document.getElementById('showInput');

const getLocationBtn = document.getElementById('getLocation');
getLocationBtn.style.display = "none";


const useDirectionsBtn = document.getElementById('showDirections');

var parkingLat = parseFloat(document.parkingLocation.latitude.value);
var parkingLng = parseFloat(document.parkingLocation.longitude.value);

const __KEY = "AIzaSyAZSUAjd5nuh5HADfctSIUJaGVzXL--lOw";

let Gmap;
let Gmarker;

var counter = 0;

var insertlatitude = null;
var insertlongitude = null;

function intilize (){
	var autocomplete = new google.maps.places.Autocomplete(document.getElementById('address'));
	
	google.maps.event.addListener(autocomplete, 'place_changed', function () {
		
		var place = autocomplete.getPlace();
		
		 insertlatitude =parseFloat( place.geometry.location.lat());
		 insertlongitude = parseFloat(place.geometry.location.lng());
		
	});	
	
	
	
};


useInputBtn.addEventListener('click', e => {
	
	UserLocation.style.display = "block";
	getLocationBtn.style.display = "block";
	useInputBtn.style.display = "none";
	useGPSBtn.style.display = "none";
	promptUser.style.display = "none";
	initilize();
});

getLocationBtn.addEventListener('click', e => {
	getLocationBtn.style.display = "none";
	UserLocation.style.display = "none";
	promptUser.style.display ="none";
	
	getInputLocation();
});

getInputLocation = () => {

console.log('User Latitude is ' + insertlatitude + ' and UserLongitude is ' + insertlongitude);
	
	console.log('Parking Location Latitude is ' + parkingLat + " and Parking Location Longitude is " + parkingLng);
	
	var lat = parseFloat(insertlatitude);
	var lng = parseFloat(insertlongitude);
			
	displayLocation(lat, lng);

}

useInputBtn.addEventListener('click', e => {
	
	UserLocation.style.display = "block";
	getLocationBtn.style.display = "block";
	useInputBtn.style.display = "none";
	useGPSBtn.style.display = "none";
	promptUser.style.display = "none";
});

useGPSBtn.addEventListener('click', e => {
	
	promptUser.style.display ="none";
	useGPSBtn.style.display = "none";
	useInputBtn.style.display = "none";
	
	getLocation();
});

getLocation = () => {
	if (navigator.geolocation) {
		navigator.geolocation.getCurrentPosition(getGPSLocation, showError, options);
	}
	
	else {
		M.toast({html: "Unsupported browser.", classes: "rounded" });
	}
}

getGPSLocation = (position) => {
	
	var lat = position.coords.latitude;
	var lng = position.coords.longitude;
	
	displayLocation(lat, lng);
}

calculateAndDisplayRoute = (latlng, parkingLatLng) => {
	
	var directionsService = new google.maps.DirectionsService();
	var directionsRenderer = new google.maps.DirectionsRenderer({suppressMarkers: true});
	
	directionsService.route( {
		origin: latlng,
		destination: parkingLatLng,
		travelMode: "DRIVING"
	},
	
	function(response, status) {
		if (status == "OK") {
			directionsRenderer.setDirections(response);
		}
		else {
			window.alert("Directions request failed due to " + status);
		}
	});
	
	directionsRenderer.setMap(Gmap);
}

displayLocation = (lat, lng) => {
	
	var latlng = {lat, lng};
	var parkingLatLng = {lat: parkingLat, lng: parkingLng};
	
	showMap(latlng);
	getLegend();
	createMarker(lat, lng);
	createMarker(parkingLat, parkingLng);
	calculateAndDisplayRoute(latlng, parkingLatLng);
	getBounds(latlng, parkingLatLng);
	
	mapArea.style.display = "block";
}

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

showMap = (latlng) => {
	
	let mapOptions = {
			center: latlng,
			zoom: 13
	};
	
	Gmap = new google.maps.Map(mapArea, mapOptions);
	
	var logoControlDiv = document.createElement('DIV');
	var logoControl = new MyLogoControl(logoControlDiv);
	logoControlDiv.index = 0; 
	Gmap.controls[google.maps.ControlPosition.TOP_RIGHT].push(logoControlDiv);
}

createMarker = (lat, lng) => {
	var switchIcon = "CP_MapMarker.png";

	if (counter % 2 == 0) {
		
		switchIcon = "CP_AltMapMarker.png";
		counter++;
	}
	
	let markerOptions = {
			position: new google.maps.LatLng(lat, lng),
			icon: switchIcon, 
			animation: google.maps.Animation.DROP,
			map: Gmap
	};
	
	Gmarker = new google.maps.Marker(markerOptions);
}

getLegend = () => {
	legendArea.style.display = 'block'
	var legend = document.getElementById('legend');
	
	var icons = {
			
			userLocation: {
				name: 'User Location',
				icon: 'CP_AltMapMarker.png'
			},
	
			parkingLocation: {
				name: 'Parking Location',
				icon: 'CP_MapMarker.png'
			}
	};
	
	for (var key in icons) {
		
		var type = icons[key];
		var name = type.name;
		var icon = type.icon;
		
		var div = document.createElement('div');
		
		div.innerHTML = '<img src="' + icon + '"> ' + name;
		
		legend.appendChild(div);
	}
	
	Gmap.controls[google.maps.ControlPosition.LEFT_BOTTOM].push(legend);
}

showError = (error) => {
	mapArea.style.display = "block"
		
	switch(error.code) {
		case error.PERMISSION_DENIED:
			mapArea.style.display = "none";
			promptUser.style.display ="block";
			promptUser.innerHTML = "Location request denied by user! Click below to enter an address manually.";
			useInputBtn.style.display = "block";
			break;
			
		case error.POSITION_UNAVAILABLE:
			mapArea.style.display = "none";
			promptUser.style.display ="block";
			promptUser.innerHTML = "User location is unavailable! Click below to enter an address manually.";
			useInputBtn.style.display = "block";
			break;
				
		case error.TIMEOUT:
			mapArea.style.display = "none";
			promptUser.style.display ="block";
			promptUser.innerHTML = "Request timed out! Click below to enter an address manually.";
			useInputBtn.style.display = "block";
			break;
				
		case error.UNKNOWN_ERROR:
			mapArea.style.display = "none";
			promptUser.style.display ="block";
			promptUser.innerHTML = "An unknown error occurred! Click below to enter an address manually.";
			useInputBtn.style.display = "block";
			break
	}
}

const options = { enableHighAccuracy: true }

getBounds = (latlng, parkingLatLng) => {
	
	const bounds = new google.maps.LatLngBounds();
	bounds.extend(latlng);
	bounds.extend(parkingLatLng);
	
	Gmap.fitBounds(bounds);
}
