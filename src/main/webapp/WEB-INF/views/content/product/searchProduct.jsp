<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="row">
	<div class="x_panel">
		<div class="x_title">
			<h2>
				What are you searching ???
			</h2>
			<ul class="nav navbar-right panel_toolbox">
				<li><a class="collapse-link"><i	class="fa fa-chevron-up"></i></a></li>
			</ul>
			<div class="clearfix"></div>
		</div>
		<div class="x_content">
		
	        <form action="searchProduct.htm" method="POST">
    		
    			<input type="hidden" name="productSubCategoryId" value="${productSubCategoryId}" />
   				<input type="hidden" name="popularAreaId" value="${popularAreaId}" />
		  		  <div class="form-group">
				    <label for="inputProductTitle" class="col-sm-2 control-label">Title</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="inputProductTitle" name="inputProductTitle" placeholder="Enter a meaningful title, which describe your product" value="">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputLastName" class="col-sm-2 control-label">Description</label>
				    <div class="col-sm-10">
				      <textarea class="form-control" id="inputLastName" name="inputLastName" placeholder="Last Name" ></textarea>
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputProductAddress" class="col-sm-2 control-label">Address</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="inputProductAddress" name="inputProductAddress" placeholder="Enter address where product is located" value="">
				    </div>
				  </div>
				  <div class="form-group form-inline">
				    <label for="inputMinPrice" class="col-sm-2 control-label">Price</label>
				    <div class="col-sm-10">
				      <input type="number" class="form-control" id="inputMinPrice" name="inputMinPrice" placeholder="Min" value="">
				      <input type="number" class="form-control" id="inputMaxPrice" name="inputMaxPrice" placeholder="Max" value="">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputAuthenticity" class="col-sm-2 control-label">Authenticity</label>
				    <div class="col-sm-10">
				      <select class="form-control" id="inputAuthenticity" name="inputAuthenticity">
				      	<c:forEach var="authenticity" items="${authenticityTypes}">
				      		<option value="${authenticity.value}">${authenticity.value.displayName}</option>
				      	</c:forEach>
				      </select>
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputType" class="col-sm-2 control-label">Type</label>
				    <div class="col-sm-10">
				      <select class="form-control" id="inputType" name="inputType">
				      	<c:forEach var="productType" items="${productTypes}">
				      		<option value="${productType.value}">${productType.value.displayName}</option>
				      	</c:forEach>
				      </select>
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputBrand" class="col-sm-2 control-label">Brand</label>
				    <div class="col-sm-10">
				      <select class="form-control" id="inputBrand" name="inputBrand">
				      	<c:choose>
				      		<c:when test="${brands != null}">
				      			<c:forEach var="brand" items="${brands}">
						      		<option value="${brand.value}">${brand.value.displayName}</option>
						      	</c:forEach>
				      		</c:when>
				      		<c:otherwise>
				      			<option value="Other">Other</option>
				      		</c:otherwise>
				      	</c:choose>
				      </select>
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputModel" class="col-sm-2 control-label">Model</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="inputModel" name="inputModel" placeholder="Enter Aditional Model Details" value="">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputCondition" class="col-sm-2 control-label">Condition</label>
				    <div class="col-sm-10">
				    	<select class="form-control" id="inputCondition" name="inputCondition">
				      		<c:forEach var="productCondition" items="${productConditions}">
				      			<option value="${productCondition.value}">${productCondition.value.displayName}</option>
			      			</c:forEach>
		      			</select>
				    </div>
				  </div>
				  
				  <c:if test="${showVehicleDiv == 1}">
					  <div id="vehiclesCategory">
					  	<div class="form-group">
						    <label for="inputBodyType" class="col-sm-2 control-label">Body Type</label>
						    <div class="col-sm-10">
						      <select class="form-control" id="inputBodyType" name="inputBodyType">
						      	<c:forEach var="bodyType" items="${bodyTypes}">
					      			<option value="${bodyType.value}">${bodyType.value.displayName}</option>
				      			</c:forEach>
						      </select>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputMinMileage" class="col-sm-2 control-label">Mileage</label>
						    <div class="col-sm-10">
						    	<input type="number" class="form-control" id="inputMinMileage" name="inputMinMileage" placeholder="Min" value="">
				      			<input type="number" class="form-control" id="inputMaxMileage" name="inputMaxMileage" placeholder="Max" value="">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputModelYear" class="col-sm-2 control-label">Model Year</label>
						    <div class="col-sm-10">
						      <input type="number" class="form-control" id="inputModelYear" name="inputModelYear" placeholder="Enter Model Year" value="">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputTransmission" class="col-sm-2 control-label">Transmission</label>
						    <div class="col-sm-10">
						      <select class="form-control" id="inputTransmission" name="inputTransmission">
						      	<c:forEach var="transmissionType" items="${transmissionTypes}">
					      			<option value="${transmissionType.value}">${transmissionType.value.displayName}</option>
				      			</c:forEach>
						      </select>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputFuel" class="col-sm-2 control-label">Fuel Type</label>
						    <div class="col-sm-10">
						      <select class="form-control" id="inputFuel" name="inputFuel">
						      	<c:forEach var="fuelType" items="${fuelTypes}">
					      			<option value="${fuelType.value}">${fuelType.value.displayName}</option>
				      			</c:forEach>
						      </select>
						    </div>
						  </div>
					  </div>
				  </c:if>
				  
				  <c:if test="${showPropertyDiv == 1}">
					  <div id="PropertyCategory">
						  <div class="form-group">
						    <label for="inputMinNoOfBathroom" class="col-sm-2 control-label">No of Bathrooms</label>
						    <div class="col-sm-10">
						    	<input type="number" class="form-control" id="inputMinNoOfBathroom" name="inputMinNoOfBathroom" placeholder="Min" value="">
				     	 		<input type="number" class="form-control" id="inputMaxNoOfBathroom" name="inputMaxNoOfBathroom" placeholder="Max" value="">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputMinNoOfRoom" class="col-sm-2 control-label">No of Rooms</label>
						    <div class="col-sm-10">
						    	<input type="number" class="form-control" id="inputMinNoOfRoom" name="inputMinNoOfRoom" placeholder="Min" value="">
				      			<input type="number" class="form-control" id="inputMaxNoOfRoom" name="inputMaxNoOfRoom" placeholder="Max" value="">
						    </div>
						  </div>
					  </div>
				  </c:if>
				  
				  <div id="ElectronicCategory">
				  
				  </div>
				  
				  <div class="form-group">
				    <div class="col-sm-offset-2 col-sm-10">
				      <button type="submit" class="btn btn-primary col-md-2 col-sm-2">Search</button>
				    </div>
				  </div>
    		
    		</form>
		
		</div>
	</div>
</div>