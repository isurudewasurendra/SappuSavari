<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAm5pznwDLoa65sMEc5uIonQO61ErAStKg"></script>

<script type="text/javascript">

$("document").ready(function(){

// 	window.setInterval(function(){
// 	}, 5000);
var firstName = "";

	$.get("../user/getSystemUser.do",{
  		userId:${sessionScope.LOGGED_USER.userId}
	    },function(data, status){
	    	var fromLatitude = data.latitude;
	    	var fromLongtitude = data.longtitude;
	    	console.log(fromLatitude);
	    	console.log(fromLongtitude);
	    	firstName = data.firstName;
	    	initializer(fromLatitude, fromLongtitude);
	    });
	
	function initializer(latitude, longtitude){
		var myCenter=new google.maps.LatLng(latitude, longtitude);

		var map = new google.maps.Map(document.getElementById('map-canvas'), {
		    zoom: 16,
		    center: myCenter
		});
		
		var marker=new google.maps.Marker({
			  position:myCenter,
			  animation:google.maps.Animation.BOUNCE,
			  url:"/hhfhf.htm",
			  icon: '../images/man_icon.png'
		  });
		marker.setMap(map);
		var infowindow = new google.maps.InfoWindow({
		  	content:"Hi "+firstName+", You are here"		  		
		  });
		infowindow.open(map,marker);

		<c:forEach var="followSeller" items="${followSellers}" varStatus="count">
			var myCenter_${count.index}=new google.maps.LatLng('${followSeller.sellerLatitude}', '${followSeller.sellerLongtitude}');
			var marker_${count.index}=new google.maps.Marker({
				  position:myCenter_${count.index},
				  animation:google.maps.Animation.DROP
			  });
			marker_${count.index}.addListener('click', function() {
			    window.location="../user/findSeller.htm?sUserId=${followSeller.sellerId}";
			  });
			marker_${count.index}.setMap(map);
			var infowindow_${count.index} = new google.maps.InfoWindow({
			  	content:"${followSeller.sellerName}(${followSeller.productTitle})"  		
			  });
			infowindow_${count.index}.open(map,marker_${count.index});
		</c:forEach>
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
<!--   <a href="../user/findSeller.htm?sUserId=2"><button>xx</button></a> -->
</div>

