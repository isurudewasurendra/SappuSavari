<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="main-content">
  <div class="swipe-area"></div>
  <a href="#" data-toggle=".container" id="sidebar-toggle"> <span class="bar"></span> <span class="bar"></span> <span class="bar"></span> </a>
  <div class="content">
    <h1>Add Product Details</h1>
		
   	<form class="form-horizontal" action="addproduct.htm" method="POST" enctype="multipart/form-data">
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
			  <div class="form-group">
			    <label for="inputMobile" class="col-sm-2 control-label">Mobile</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputMobile" name="inputMobile" placeholder="Enter your mobile to contact" value="">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputTelephone" class="col-sm-2 control-label">Telephone</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputTelephone" name="inputTelephone" placeholder="Enter your Telephone to contact" value="">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputFax" class="col-sm-2 control-label">Fax</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputFax" name="inputFax" placeholder="Enter your Fax to contact" value="">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputEmailAddress" class="col-sm-2 control-label">Email</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputEmailAddress" name="inputEmailAddress" placeholder="Enter your Email to contact" value="">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="inputProductPic1" class="col-sm-2 control-label">Product Image 1</label>
			    <div class="col-sm-10">
			      <input type="file" class="form-control" id="inputProductPic1" name="inputProductPic" placeholder="Profile Picture">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputProductPic1" class="col-sm-2 control-label">Product Image 2</label>
			    <div class="col-sm-10">
			      <input type="file" class="form-control" id="inputProductPic2" name="inputProductPic" placeholder="Profile Picture">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputProductPic1" class="col-sm-2 control-label">Product Image 3</label>
			    <div class="col-sm-10">
			      <input type="file" class="form-control" id="inputProductPic3" name="inputProductPic" placeholder="Profile Picture">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputProductPic1" class="col-sm-2 control-label">Product Image 4</label>
			    <div class="col-sm-10">
			      <input type="file" class="form-control" id="inputProductPic4" name="inputProductPic" placeholder="Profile Picture">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputProductPic1" class="col-sm-2 control-label">Product Image 5</label>
			    <div class="col-sm-10">
			      <input type="file" class="form-control" id="inputProductPic5" name="inputProductPic" placeholder="Profile Picture">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="inputPrice" class="col-sm-2 control-label">Price</label>
			    <div class="col-sm-10">
			      <input type="number" class="form-control" id="inputPrice" name="inputPrice" placeholder="Enter Price" value="">
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
					    <label for="inputMileage" class="col-sm-2 control-label">Mileage</label>
					    <div class="col-sm-10">
					      <input type="number" class="form-control" id="inputMileage" name="inputMileage" placeholder="Enter Mileage" value="">
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
					    <label for="inputNoOfBathroom" class="col-sm-2 control-label">No of Bathrooms</label>
					    <div class="col-sm-10">
					      <input type="number" class="form-control" id="inputNoOfBathroom" name="inputNoOfBathroom" placeholder="Enter No of Bathrooms" value="0">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputNoOfRoom" class="col-sm-2 control-label">No of Rooms</label>
					    <div class="col-sm-10">
					      <input type="number" class="form-control" id="inputNoOfRoom" name="inputNoOfRoom" placeholder="Enter No of Rooms" value="0">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputSize" class="col-sm-2 control-label">Size</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="inputSize" name="inputSize" placeholder="Enter Size of your property" value="0">
					    </div>
					  </div>
				  </div>
			  </c:if>
			  
			  <div id="ElectronicCategory">
			  
			  </div>
			  
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-default">Submit</button>
			    </div>
			  </div>
		</form>
		
  </div>
</div>

