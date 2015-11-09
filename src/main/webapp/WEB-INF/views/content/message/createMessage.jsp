<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="main-content">
  <div class="swipe-area"></div>
  <a href="#" data-toggle=".container" id="sidebar-toggle"> <span class="bar"></span> <span class="bar"></span> <span class="bar"></span> </a>
  <div class="content">
    <h1>Create Messages</h1>
    	<div class="container-fluid">
    	
    		<form  class="form-horizontal" action="" method="POST" >
    			<input type="hidden" name="productId" id="productId" value="${productId}" />
   				<div class="form-group">
				    <label for="inputReceiver" class="col-sm-2 control-label">To</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="inputReceiver" name="inputReceiver" placeholder="Receiver Email" value="${receiver.username}">
				    </div>
			  	</div>
			  	<div class="form-group">
				    <label for="inputSender" class="col-sm-2 control-label">From</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="inputSender" name="inputSender" placeholder="Sender Email" value="${sender.username}">
				    </div>
			  	</div>
			  	<div class="form-group">
				    <label for="inputSubject" class="col-sm-2 control-label">From</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="inputSubject" name="inputSubject" placeholder="Subject of the Message" >
				    </div>
			  	</div>
			  	<div class="form-group">
				    <label for="inputMessage" class="col-sm-2 control-label">Message</label>
				    <div class="col-sm-10">
				      <textarea class="form-control" id="inputMessage" name="inputMessage" ></textarea>
				    </div>
			  	</div>
			  	
			  	<div class="form-group">
				    <div class="col-sm-offset-2 col-sm-10">
				      <button type="submit" class="btn btn-default">Send</button>
				    </div>
			  	</div>
    		</form>
    		
    	</div>
    </div>
</div>

