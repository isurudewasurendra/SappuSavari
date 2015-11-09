<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="main-content">
  <div class="swipe-area"></div>
  <a href="#" data-toggle=".container" id="sidebar-toggle"> <span class="bar"></span> <span class="bar"></span> <span class="bar"></span> </a>
  <div class="content">
    <h1>Search Result</h1>
    	<div class="container-fluid">
			<c:forEach var="searchRequest" items="${searchRequestList}">
				<div>
					product Id:${searchRequest.searchRequestId}
					<a href="removeearchHistory.htm?shId=${searchRequest.searchRequestId}">remove</a>
				</div>
			</c:forEach>    
			
			<a href="removeAllearchHistory.htm?userId=${sessionScope.LOGGED_USER.userId}">Clear All</a> 		
    	</div>
    </div>
</div>

