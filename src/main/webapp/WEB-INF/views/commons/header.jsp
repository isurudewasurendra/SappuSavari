<script type="text/javascript">

window.setInterval(function(){
	
	function success(pos) {
		  var crd = pos.coords;

		  	$.post("../user/updateUserLocation.htm",
	   	    {
		  		userId:"${sessionScope.LOGGED_USER.userId}",
	   	        latt: crd.latitude,
	   	        longt: crd.longitude,
	   	        acc:crd.accuracy
	   	    },
	   	    function(data, status){
	   	        console.log("location saved...");
	   	    });
		  
		};

		function error(err) {
		  console.warn('ERROR(' + err.code + '): ' + err.message);
		};

		var options = {
		  enableHighAccuracy: true,
		  timeout: 5000,
		  maximumAge: 0
		};

		navigator.geolocation.getCurrentPosition(success, error, options);
	
}, 500000);

</script>