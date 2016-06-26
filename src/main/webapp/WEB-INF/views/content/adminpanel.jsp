<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<script type="text/javascript">


</script>

<style>

</style>

<div class="main-content">
  <div class="swipe-area"></div>
  <a href="#" data-toggle=".container" id="sidebar-toggle"> <span class="bar"></span> <span class="bar"></span> <span class="bar"></span> </a>
  <div class="content">
  
  <form action="viewChart.htm" target="_blank">
  	Product :
  	<select name="productCategoryId">
  		<option value="1">Mobile</option>
  		<option value="2">Mobile Accessories</option>
  		<option value="3">Computer</option>
  		<option value="4">Computer Accessories</option>
  		<option value="6">Camera</option>
  		<option value="20">Camera Accessories</option>
  		<option value="5">TV</option>
  		<option value="7">Audio</option>
  		<option value="21">refrigerator</option>
  	</select>
  	
  	<br/><br/>
  	Chart Type : 
  	<select name="chartType">
  		<option value="VIEW">View Statistics</option>
  		<option value="COMMENT">Comment Statistics</option>
  		<option value="CONTACT">Seller Contact Statistics</option>
  	</select>
  
  	<hr/>
  	
  	<input type="submit" value="Run" />
  	
  </form>
  
  </div>
</div>

