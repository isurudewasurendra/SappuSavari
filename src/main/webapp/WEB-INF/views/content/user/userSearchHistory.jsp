<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="row">
	<div class="x_panel">
		<div class="x_title">
			<h2>
				Search Result
			</h2>
			<ul class="nav navbar-right panel_toolbox">
				<li><a class="collapse-link"><i	class="fa fa-chevron-up"></i></a></li>
			</ul>
			<div class="clearfix"></div>
		</div>
		<div class="x_content">
		
			<c:forEach var="searchRequest" items="${searchRequestList}">
				<div>
					product Id:${searchRequest.searchRequestId}
					<a class="btn btn-primary col-md-2 col-sm-2" href="removeearchHistory.htm?shId=${searchRequest.searchRequestId}">remove</a>
				</div>
			</c:forEach> 
			
			<a class="btn btn-primary col-md-2 col-sm-2" href="removeAllearchHistory.htm?userId=${sessionScope.LOGGED_USER.userId}">Clear All</a> 
		
		</div>
	</div>
</div>

