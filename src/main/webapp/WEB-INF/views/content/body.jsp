<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAm5pznwDLoa65sMEc5uIonQO61ErAStKg"></script>

<script type="text/javascript">

/*var latitude = 0;
var longtitude = 0;

function success(pos) {
	  var crd = pos.coords;
	  latitude = crd.latitude;
	  longtitude = crd.longitude;
	  
	  initialize(latitude, longtitude);
};

function error(err) {
  console.warn('ERROR(' + err.code + '): ' + err.message);
};

var options = {
  enableHighAccuracy: true,
  timeout: 5000,
  maximumAge: 0
};

window.setInterval(function(){
	navigator.geolocation.getCurrentPosition(success, error, options);
}, 5000);

var map;
function initialize(latitude, longtitude) {
	var myCenter=new google.maps.LatLng(latitude,longtitude);
	
  map = new google.maps.Map(document.getElementById('map-canvas'), {
    zoom: 16,
    center: myCenter
  });
  
  var marker=new google.maps.Marker({
	  position:myCenter,
	  animation:google.maps.Animation.BOUNCE
  });

  marker.setMap(map);
  
  var infowindow = new google.maps.InfoWindow({
  	content:
  		<c:choose>
  			<c:when test="${sessionScope.LOGGED_USER.firstName != null}">
  				"Hi ${sessionScope.LOGGED_USER.firstName}, You are here"
  			</c:when>
  			<c:otherwise>
  				"You are Here, Please login to coninue shopping"
  			</c:otherwise>
		</c:choose>
  		
  });

   infowindow.open(map,marker);
}

//google.maps.event.addDomListener(window, 'load', initialize);*/

$("document").ready(function(){

	window.setInterval(function(){
	  	
	  	$.get("../user/getSystemUser.htm",{
	  		userId:${sessionScope.LOGGED_USER.userId}
   	    },function(data, status){
   	    	var fromLatitude = data.latitude;
   	    	var fromLongtitude = data.longtitude;
   	    	initializer(fromLatitude, fromLongtitude);
   	    });
		
	}, 5000);
	
	function initializer(latitude, longtitude){
		var myCenter=new google.maps.LatLng(latitude, longtitude);

		var map = new google.maps.Map(document.getElementById('map-canvas'), {
		    zoom: 16,
		    center: myCenter
		});
		
		var marker=new google.maps.Marker({
			  position:myCenter,
			  animation:google.maps.Animation.BOUNCE
		  });

		marker.setMap(map);
	}
});




</script>

<style>

#map-canvas{
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
    <h1>We Found You Here...</h1>
		<div class="container-fluid">
			<div id="map-canvas"></div>
		</div>
  </div>
</div>

