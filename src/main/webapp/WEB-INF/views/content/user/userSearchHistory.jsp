<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
		
			<table class="table table-striped table-bordered">
				<tr>
					<th>No</th>
					<th>Title</th>
					<th>Description</th>
					<th>Authenticity</th>
					<th>Address</th>
					<th>Min Price</th>
					<th>Max Price</th>
					<th></th>
					<th></th>
				</tr>
				<c:forEach var="searchRequest" items="${searchRequestList}" varStatus="count">
					<tr>
						<td>${count.index+1}</td>
						<td>${searchRequest.title}</td>
						<td>${searchRequest.description}</td>
						<td>${searchRequest.authenticity}</td>
						<td>${searchRequest.address}</td>
						<td><fmt:formatNumber value="${searchRequest.minPrice}" type="number" maxFractionDigits="3"/></td>
						<td><fmt:formatNumber value="${searchRequest.maxPrice}" type="number" maxFractionDigits="3"/></td>
						<td><a href="userSearchHistory.htm?shId=${searchRequest.searchRequestId}"><img src="../images/show-menu-icon.png" style="height: 15px;" /></a></td>
						<td><a href="removeearchHistory.htm?shId=${searchRequest.searchRequestId}"><img src="../images/remove_icon.png" style="height: 15px;" /></a></td>
					</tr>
				</c:forEach>
			</table>
		
			<a class="btn btn-primary col-md-2 col-sm-2" href="removeAllearchHistory.htm?userId=${sessionScope.LOGGED_USER.userId}">Clear All</a> 
		
		</div>
	</div>
</div>

