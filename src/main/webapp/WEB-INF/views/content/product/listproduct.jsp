<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="main-content">
  <div class="swipe-area"></div>
  <a href="#" data-toggle=".container" id="sidebar-toggle"> <span class="bar"></span> <span class="bar"></span> <span class="bar"></span> </a>
  <div class="content">
    <h1>Touch Swipeable Sidebar Menu Demo</h1>
    	<div class="container-fluid">
    		<div class="row">
			  <div class="col-sm-1">Preview</div>
			  <div class="col-sm-3">Title</div>
			  <div class="col-sm-5">Description</div>
			  <div class="col-sm-2">Created Date</div>
			  <div class="col-sm-1">State</div>
			</div>
    		<c:forEach var="product" items="${productList}">
				<div class="row">
				  <div class="col-sm-1">${product.productTitle}</div>
				  <div class="col-sm-3">${product.productTitle}</div>
				  <div class="col-sm-5">${product.description}</div>
				  <div class="col-sm-2">${product.createdDateTime}</div>
				  <div class="col-sm-1">${product.productStatus}</div>
				</div>
			</c:forEach>
    		
    	</div>
    	<br/><hr/>
    	<a href="listProductCategory.htm"><button>Add More Product</button></a>
    </div>
</div>

