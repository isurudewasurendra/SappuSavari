<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAm5pznwDLoa65sMEc5uIonQO61ErAStKg"></script>

<div class="main-content">
  <div class="swipe-area"></div>
  <a href="#" data-toggle=".container" id="sidebar-toggle"> <span class="bar"></span> <span class="bar"></span> <span class="bar"></span> </a>
  <div class="content">
    <h1>Follow the Buyer</h1>
    	<div class="container-fluid">
   			<div>
		     	<div id="map" style="height: 600px;"></div>
		     	<div id="panel"></div> 
	   		</div>
    	</div>
    </div>
</div>

<script type="text/javascript"> 

	var directionsService = new google.maps.DirectionsService();
	var directionsDisplay = new google.maps.DirectionsRenderer();
	
	var map = new google.maps.Map(document.getElementById('map'), {
	  zoom:7,
	  mapTypeId: google.maps.MapTypeId.ROADMAP,
	  travelMode: google.maps.DirectionsTravelMode.WALKING
	});
	
	directionsDisplay.setMap(map);
	directionsDisplay.setPanel(document.getElementById('panel'));
	
	window.setInterval(function(){
		
		$.get("../user/getSystemUser.htm",{
	  		userId:1
   	    },function(data, status){
   	    	var fromLatitude = data.latitude;
   	    	var fromLongtitude = data.longtitude;
   	    	getToSystemUserDetails(fromLatitude, fromLongtitude);
   	    });
		
		
	}, 5000);
	
	function getFromSystemUserDetails(){
		$.get("../user/getSystemUser.htm",{
	  		userId:1
   	    },function(data, status){
   	    	handleData(data); 
   	    });
	}
	
	function getToSystemUserDetails(fromLat, fromLong){
		$.get("../user/getSystemUser.htm",{
	  		userId:1
   	    },function(data, status){
   	    	var toLatitude = data.latitude;
   	    	var toLongtitude = data.longtitude;
   	    	
   	    	var request = {
	  	       origin: new google.maps.LatLng(fromLat, fromLong),
	  	       destination: new google.maps.LatLng(toLatitude, toLongtitude),
	  	       travelMode: google.maps.DirectionsTravelMode.DRIVING
	  	     };
	  		
	  		directionsService.route(request, function(response, status) {
	  		  if (status == google.maps.DirectionsStatus.OK) {
	  		    directionsDisplay.setDirections(response);
	  		  }
	  		});
   	    });
	}

</script> 
