<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div id="login" class="animate form">
	<section class="login_content">
		<form role="form" method="post" action="<c:url value='/login_check' />" onsubmit="return true">
			<h1>Login Form</h1>
			<div>
				<input class="form-control" type="text" id="inputEmail" name="username" placeholder="UserName" required autofocus />
			</div>
			<div>
				<input class="form-control" type="password" name="password" id="password" placeholder="Password" required="">
			</div>
			<div>
				<input type="submit" class="btn btn-default submit" value="Login" />
				<a href="signup.htm">SignUp</a>
			</div>
			<div class="clearfix"></div>
			<div class="separator">

				<div class="clearfix"></div>
				<br />
				<div>
					<h1>
						<i class="fa fa-area-chart" style="font-size: 26px;"></i> Sappu Savari
					</h1>
					Copyright � 2016.<a>
				All Rights Reserved.</a>| <span class="lead"> <i
				class="fa fa-area-chart"></i> Sappu Savari

				</div>
			</div>
		</form>
		<div class="panel-footer">
   	 		<c:if test="${not empty param.login_error}">
			    <div class="alert alert-danger">
		          INVALID USERNAME OR PASSWORD
		       	</div>
			</c:if>
        </div>
	</section>
</div>