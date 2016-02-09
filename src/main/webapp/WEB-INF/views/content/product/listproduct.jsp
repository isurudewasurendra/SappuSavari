<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="row">
	<div class="x_panel">
		<div class="x_title">
			<h2>
				Products
			</h2>
			<ul class="nav navbar-right panel_toolbox">
				<li><a class="collapse-link"><i	class="fa fa-chevron-up"></i></a></li>
			</ul>
			<div class="clearfix"></div>
		</div>
		<div class="x_content">
		
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
		
		<br/><hr/>
    	<a href="listProductCategory.htm" class="btn btn-primary btn-lg">Add More Product</a>
		
		</div>
	</div>
</div>