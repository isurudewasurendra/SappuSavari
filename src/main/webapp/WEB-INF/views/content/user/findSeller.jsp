<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAm5pznwDLoa65sMEc5uIonQO61ErAStKg"></script>

<script type="text/javascript">

$("document").ready(function(){

	var fromlat = ${buyer.latitude};
	var fromlong = ${buyer.longtitude};

	window.setInterval(function(){
		$.get("../user/getSystemUser.do",{
	  		userId:${sessionScope.LOGGED_USER.userId}
		    },function(data, status){
		    	fromlat = data.latitude;
		    	fromlong = data.longtitude;
		    	console.log(fromlat);
		    	console.log(fromlong);
		    });
	}, 1000);
	
	var Center = new google.maps.LatLng(${buyer.latitude}, ${buyer.longtitude});
	var directionsDisplay;
	var directionsService = new google.maps.DirectionsService();
	var map;

	function initialize() {
	  directionsDisplay = new google.maps.DirectionsRenderer();
	  var properties = {
	    center: Center,
	    zoom: 20,
	    mapTypeId: google.maps.MapTypeId.MAP
	  };

	  map = new google.maps.Map(document.getElementById("map"), properties);
	  directionsDisplay.setMap(map);

	  var marker = new google.maps.Marker({
	    position: Center,
	    animation: google.maps.Animation.BOUNCE,
	    icon: '../images/man_icon.png'
	  });

	  window.setInterval(function(){
			changeMarkerPosition(marker);
		}, 1000);

	  marker.setMap(map);
	  Route();
	}

	function changeMarkerPosition(marker) {
	    var latlng = new google.maps.LatLng(fromlat, fromlong);
	    marker.setPosition(latlng);
	}

	function Route() {

	  var start = new google.maps.LatLng(${buyer.latitude}, ${buyer.longtitude});
	  var end = new google.maps.LatLng(${seller.latitude}, ${seller.longtitude});
	  var request = {
	    origin: start,
	    destination: end,
	    travelMode: google.maps.TravelMode.DRIVING
	  };
	  directionsService.route(request, function(result, status) {
	    if (status == google.maps.DirectionsStatus.OK) {
	      directionsDisplay.setDirections(result);
	    } else {
	      alert("couldn't get directions:" + status);
	    }
	  });
	}

	google.maps.event.addDomListener(window, 'load', initialize);

});

</script>

<style>

#map{
	border-width:1px;
	border-style:solid;
	width: 100%;
	height: 500px;
}

</style>

<div class="main-content">
  <div class="swipe-area"></div>
  <a href="#" data-toggle=".container" id="sidebar-toggle"> <span class="bar"></span> <span class="bar"></span> <span class="bar"></span> </a>
  <div class="content">
    <h1>Follow Seller</h1>
		<div class="container-fluid">
			<div id="map"></div>
		</div>
  </div>
</div>

