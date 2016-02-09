<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="row">
	<div class="x_panel">
		<div class="x_title">
			<h2>
				Select Product Category
			</h2>
			<ul class="nav navbar-right panel_toolbox">
				<li><a class="collapse-link"><i	class="fa fa-chevron-up"></i></a></li>
			</ul>
			<div class="clearfix"></div>
		</div>
		<div class="x_content">
		
	        <c:forEach var="productCategory" items="${productCategoryList}">
				<a href="listProductSubCategory.htm?pcid=${productCategory.productCategoryId}" class="btn btn-default">${productCategory.categoryName}</a>
			</c:forEach>
		
		</div>
	</div>
</div>
