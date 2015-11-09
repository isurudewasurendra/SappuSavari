<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<script>
  $(window).load(function(){
        $("[data-toggle]").click(function() {
          var toggle_el = $(this).data("toggle");
          $(toggle_el).toggleClass("open-sidebar");
        });
         $(".swipe-area").swipe({
              swipeStatus:function(event, phase, direction, distance, duration, fingers)
                  {
                      if (phase=="move" && direction =="right") {
                           $(".container").addClass("open-sidebar");
                           return false;
                      }
                      if (phase=="move" && direction =="left") {
                           $(".container").removeClass("open-sidebar");
                           return false;
                      }
                  }
          }); 
      });
</script>

<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="continer-fluid">
		<div>
			<ul class="nav navbar-nav pull-left">
				<li class="active"><a href="../home/home.htm"><span class="glyphicon glyphicon-asterisk"></span>Sappu Savari Home</a></li>
			</ul>
			<c:choose>
				<c:when test="${sessionScope.LOGGED_USER.firstName == null}">
					<ul class="nav navbar-nav pull-right">
						<li><a href="../login/login.htm"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
					</ul>
				</c:when>
				<c:otherwise>
					<ul class="nav navbar-nav pull-right">
						<li><a href="../j_spring_security_logout"><span class="glyphicon glyphicon-off"></span> Logout</a></li>
					</ul>
					<ul class="nav navbar-nav pull-right">
						<li><a href="../user/userprofile.htm?username=${sessionScope.LOGGED_USER.username}"><span class="glyphicon glyphicon-user"></span> Hi, ${sessionScope.LOGGED_USER.firstName}</a></li>
					</ul>
				</c:otherwise>
			</c:choose>
			
			
		</div>
	</div>
</div>

