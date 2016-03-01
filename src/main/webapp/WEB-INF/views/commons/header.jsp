<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%> 
<%@taglib uri="http://www.springframework.org/tags" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>   
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<div class="col-md-3 left_col">
	<div class="left_col scroll-view">
		<div class="navbar nav_title" style="border: 0;">
			<a href="../home/home.htm" class="site_title"><i class="fa fa-area-chart"></i> <span>Savari</span></a>
		</div>
		<div class="clearfix"></div>

		<br />

		<!-- sidebar menu -->
		<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">

			<div class="menu_section">
				<h2>Sappu Savari</h2><br> <br>
				
				<ul class="nav side-menu">
					<li><a href="../home/home.htm"><i class="fa fa-home"></i> Home</a></li>
					<li><a href="#"><i class="fa fa-usd"></i> Products <span class="fa fa-chevron-down"></span></a>
						<ul class="nav child_menu" style="display: none">
							<li><a href="../buy/listProductCategory.htm">Buy</a></li>
							<li><a href="../sell/listProductCategory.htm">Sell</a></li>
							<li><a href="../sell/listProduct.htm">My Store</a></li>
						</ul>
					</li>
					<li><a href="#"><i class="fa fa-edit"></i> Messages <span class="fa fa-chevron-down"></span></a>
						<ul class="nav child_menu" style="display: none">
							<li><a href="../message/messageDashBoard.htm">Dash board</a></li>
							<li><a href="../message/messageInbox.htm">Inbox</a></li>
							<li><a href="../message/messageSent.htm">Sent</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
		<!-- /sidebar menu -->
	</div>
</div>

<!-- top navigation -->
<div class="top_nav">

	<div class="nav_menu">
		<nav class="" role="navigation">
			<div class="nav toggle">
				<a id="menu_toggle"><i class="fa fa-bars"></i></a>
			</div>

			<ul class="nav navbar-nav navbar-right">
				<li class="">
					<a href="javascript:;"
					class="user-profile dropdown-toggle" data-toggle="dropdown"
					aria-expanded="false"> <img src="<c:url value="/images/img.jpg"/>" alt="">
					<span class=" fa fa-angle-down"></span>
					</a>
					<ul	class="dropdown-menu dropdown-usermenu animated fadeInDown pull-right">
						<li><a href="../user/userprofile.htm?username=${sessionScope.LOGGED_USER.username}"> Profile</a></li>
						<li><a href="../user/viewSearchHistory.htm?userId=${sessionScope.LOGGED_USER.userId}"> Search History</a></li>
						<li><a href="../notification/notificatoinDashBoard.htm?userId=${sessionScope.LOGGED_USER.userId}">Notification</a></li>
						<li><a href="../login/logout.htm"><i	class="fa fa-sign-out pull-right"></i> Log Out</a></li>
					</ul>
				</li>
				<li class="">
					<a href="javascript:;"
					class="user-profile dropdown-toggle" data-toggle="dropdown"
					aria-expanded="false"> <img src="<c:url value="/images/bell.png"/>" alt="">
					<span class=" fa fa-angle-down"></span>
					</a>
					<ul	class="dropdown-menu dropdown-usermenu animated fadeInDown pull-right" id="notificationUl">
						
					</ul>
				</li>
				<li class="">
                    <a href="../user/userprofile.htm?username=${sessionScope.LOGGED_USER.username}"><span class="badge bg-green"> Hi, ${sessionScope.LOGGED_USER.username}</span></a>
                </li>
			</ul>
		</nav>
	</div>

</div>
<!-- /top navigation -->

<script type="text/javascript">

$("document").ready(function(){
	/*function success(pos) {
		  var crd = pos.coords;

		  	$.post("../user/updateUserLocation.do",
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

		navigator.geolocation.getCurrentPosition(success, error, options);*/

	$.post("../notification/getNotifications.do",
    {userId:"${sessionScope.LOGGED_USER.userId}"},
    function(data, status){
        console.log(data);
        $("#notificationUl").html("");
        var htmlString = "";
        $.each(data, function(i, item) {
        	htmlString = htmlString + "<li><a href='../product/showProduct.htm?productId="+item.product.productId+"'>"+item.description+"("+item.user.firstName+"/"+item.product.productTitle+")</a></li>";
        });
        $("#notificationUl").html(htmlString);
        
    });

});

</script>