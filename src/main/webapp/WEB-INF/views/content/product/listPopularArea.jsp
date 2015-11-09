<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="main-content">
  <div class="swipe-area"></div>
  <a href="#" data-toggle=".container" id="sidebar-toggle"> <span class="bar"></span> <span class="bar"></span> <span class="bar"></span> </a>
  <div class="content">
    <h1>Select Popular Area</h1>
    	<div class="container-fluid">
			<c:forEach var="popularArea" items="${popularAreaList}">
				<a href="addproduct.htm?pscid=${productSubCategoryId}&paid=${popularArea.areaId}"><button>${popularArea.areaName}</button></a>
			</c:forEach>
    	</div>
    </div>
</div>

