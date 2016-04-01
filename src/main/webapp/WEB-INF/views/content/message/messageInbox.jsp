<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="row">
	<div class="x_panel">
		<div class="x_title">
			<h2>
				Inbox
			</h2>
			<ul class="nav navbar-right panel_toolbox">
				<li><a class="collapse-link"><i	class="fa fa-chevron-up"></i></a></li>
			</ul>
			<div class="clearfix"></div>
		</div>
		<div class="x_content">
		
			<table class="table table-striped table-bordered" id="buildingLotsTable">
				<tr>
					<th>No</th>
					<th>From</th>
					<th>Date</th>
					<th>Subject</th>
					<th>Content</th>
					<th></th>
				</tr>
				<c:forEach var="message" items="${inboxMessages}" varStatus="count">
					<tr>
						<td>${count.index+1}</td>
						<td>${message.sender.username}</td>
						<td>${message.createdDateTime}</td>
						<td>${message.subject}</td>
						<td>${message.message}</td>
						<td><a href="../message/createMessage.htm?owner=${message.sender.userId}&productId=${message.productId}">Reply</a></td>
					</tr>
    			</c:forEach>
			</table>
		
		</div>
	</div>
</div>

