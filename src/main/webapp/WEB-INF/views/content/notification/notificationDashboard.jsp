<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="row">
	<div class="x_panel">
		<div class="x_title">
			<h2>
				Notifications
			</h2>
			<ul class="nav navbar-right panel_toolbox">
				<li><a class="collapse-link"><i	class="fa fa-chevron-up"></i></a></li>
			</ul>
			<div class="clearfix"></div>
		</div>
		<div class="x_content">
		
			<table class="table table-striped table-bordered" id="buildingLotsTable">
				<c:forEach var="notification" items="${notificationList}" varStatus="count">
					<tr
						<c:if test="${notification.seenStatus == 0}">
							style="background-color: #1ABB9C;"
						</c:if>
					 >
						<td>${count.index+1}</td>
						<td>${notification.description}</td>
						<td>${notification.product.productTitle}</td>
						<td><fmt:formatNumber value="${notification.product.price}" type="number" maxFractionDigits="3"/></td>
						<td><a href="../product/showProduct.htm?productId=${notification.product.productId}"><img src="../images/show-menu-icon.png" style="height: 15px;" /></a></td>
						<td><a href="../notification/removeNotification.htm?notId=${notification.notificationId}"><img src="../images/remove_icon.png" style="height: 15px;" /></a></td>
					</tr>
    			</c:forEach>
			</table>

		</div>
	</div>
</div>
