<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<jsp:useBean id="random" class="java.util.Random" scope="application"/>

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
					<th>Preview</th>
					<th>Title</th>
					<th>Description</th>
					<th>Created Date</th>
					<th>State</th>
					<th></th>
				</tr>
				
	    		<c:forEach var="product" items="${productList}" varStatus="productLoop">
					<tr>
					  <td><img src="../download/getProductImage.htm?fname=${product.multiMediaList[random.nextInt(5)].media}" style="height: 60px;"/></td>
					  <td>${product.productTitle}</td>
					  <td>${product.description}</td>
					  <td>${product.createdDateTime}</td>
					  <td>${product.productStatus}</td>
					  <th><a href="../product/showProduct.htm?productId=${product.productId}"><img src="../images/show-menu-icon.png" style="height: 15px;" /></a></th>
					</tr>
				</c:forEach>
			
			</table>
		
		</div>
	</div>
</div>

