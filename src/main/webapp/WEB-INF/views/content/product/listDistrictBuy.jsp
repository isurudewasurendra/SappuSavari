<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="main-content">
  <div class="swipe-area"></div>
  <a href="#" data-toggle=".container" id="sidebar-toggle"> <span class="bar"></span> <span class="bar"></span> <span class="bar"></span> </a>
  <div class="content">
    <h1>Select District</h1>
    	<div class="container-fluid">
			<c:forEach var="district" items="${districtList}">
				<a href="listPopularArea.htm?pscid=${productSubCategoryId}&did=${district.districtId}"><button>${district.districtName}</button></a>
			</c:forEach>
    	</div>
    </div>
</div>
