<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="row">
	<div class="x_panel">
		<div class="x_title">
			<h2>
				Add Search Session
			</h2>
			<ul class="nav navbar-right panel_toolbox">
				<li><a class="collapse-link"><i	class="fa fa-chevron-up"></i></a></li>
			</ul>
			<div class="clearfix"></div>
		</div>
		<div class="x_content">
		
	        <form class="form-horizontal" action="searchsession.htm" method="POST">
        		<div class="form-group">
				    <label for="inputProductTitle" class="col-sm-2 control-label">Product Category</label>
				    <div class="col-sm-10">
				      <select id="productCategory" name="productCategory">
				      	<c:forEach var="category" items="${categories}">
				      		<option value="${category.productSubCategoryId}">${category.subCategoryName}</option>
				      	</c:forEach>
				      </select>
				    </div>
		  		 </div>
		  		 <div class="form-group">
				    <label for="inputProductTitle" class="col-sm-2 control-label">Count</label>
				    <div class="col-sm-10">
				      <input type="text" id="count" name="count" value="0"/>
				    </div>
		  		 </div>
		  		 
		  		 <div class="form-group">
				    <label for="inputProductTitle" class="col-sm-2 control-label">Child Product Category</label>
				    <div class="col-sm-10">
				      <select id="childProductCategory" name="childProductCategory">
				      	<c:forEach var="category" items="${categories}">
				      		<option value="${category.productSubCategoryId}">${category.subCategoryName}</option>
				      	</c:forEach>
				      </select>
				    </div>
		  		 </div>
		  		 <div class="form-group">
				    <label for="inputProductTitle" class="col-sm-2 control-label">Child Count</label>
				    <div class="col-sm-10">
				      <input type="text" id="childcount" name="childcount" value="0"/>
				    </div>
		  		 </div>
		  		 
		  		 <div class="form-group">
				    <label for="inputProductTitle" class="col-sm-2 control-label">Second Child Product Category</label>
				    <div class="col-sm-10">
				      <select id="secondChildProductCategory" name="secondChildProductCategory">
				      	<c:forEach var="category" items="${categories}">
				      		<option value="${category.productSubCategoryId}">${category.subCategoryName}</option>
				      	</c:forEach>
				      </select>
				    </div>
		  		 </div>
		  		 <div class="form-group">
				    <label for="inputProductTitle" class="col-sm-2 control-label">Second Child Count</label>
				    <div class="col-sm-10">
				      <input type="text" id="secondChildcount" name="secondChildcount" value="0" />
				    </div>
		  		 </div>
		  		 
		  		 <div class="form-group">
				    <label for="inputProductTitle" class="col-sm-2 control-label">third Child Product Category</label>
				    <div class="col-sm-10">
				      <select id="thirdChildProductCategory" name="thirdChildProductCategory">
				      	<c:forEach var="category" items="${categories}">
				      		<option value="${category.productSubCategoryId}">${category.subCategoryName}</option>
				      	</c:forEach>
				      </select>
				    </div>
		  		 </div>
		  		 <div class="form-group">
				    <label for="inputProductTitle" class="col-sm-2 control-label">Third Child Count</label>
				    <div class="col-sm-10">
				      <input type="text" id="thirdChildcount" name="thirdChildcount" value="0"/>
				    </div>
		  		 </div>
		  		 
		  		 <div class="form-group">
				    <label for="inputProductTitle" class="col-sm-2 control-label">third Child Product Category</label>
				    <div class="col-sm-10">
				      <select id="fourthChildProductCategory" name="fourthChildProductCategory">
				      	<c:forEach var="category" items="${categories}">
				      		<option value="${category.productSubCategoryId}">${category.subCategoryName}</option>
				      	</c:forEach>
				      </select>
				    </div>
		  		 </div>
		  		 <div class="form-group">
				    <label for="inputProductTitle" class="col-sm-2 control-label">Fourth Child Count</label>
				    <div class="col-sm-10">
				      <input type="text" id="fouthChildcount" name="fouthChildcount" value="0"/>
				    </div>
		  		 </div>
		  		 
		  		 <div class="form-group">
				    <div class="col-sm-offset-2 col-sm-10">
				      <button type="submit" class="btn btn-primary col-md-2 col-sm-2">Submit</button>
				    </div>
				  </div>
			</form>
		
		</div>
	</div>
</div>
