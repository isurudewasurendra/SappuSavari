<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="main-content">
  <div class="swipe-area"></div>
  <a href="#" data-toggle=".container" id="sidebar-toggle"> <span class="bar"></span> <span class="bar"></span> <span class="bar"></span> </a>
  <div class="content">
    <h1>Messages</h1>
    	<div class="container-fluid">
    	
    		<h2>Sent</h2><hr/>
    		<div>
    			<c:forEach var="message" items="${sentMessages}">
    				<span>${message.messageId}</span>
    				<span>${message.message}</span>
    			</c:forEach>
    		</div>
    		
    	</div>
    </div>
</div>

