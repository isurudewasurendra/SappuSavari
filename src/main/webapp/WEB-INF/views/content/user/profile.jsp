<script type="text/javascript">
    $(function () {
        $('#inputDateOfBirth').datepicker({
        	changeMonth: true,
            changeYear: true
        });
    });
</script>

<div class="row">
	<div class="x_panel">
		<div class="x_title">
			<h2>
				Profile
			</h2>
			<ul class="nav navbar-right panel_toolbox">
				<li><a class="collapse-link"><i	class="fa fa-chevron-up"></i></a></li>
			</ul>
			<div class="clearfix"></div>
		</div>
		<div class="x_content">
			<form class="form-horizontal" action="userprofile.htm" method="POST" enctype="multipart/form-data">
	    		<input type="hidden" name="UserId" value="${systemUser.userId}" />
			  <div class="form-group">
			    <label for="inputFirstName" class="col-sm-2 control-label">First Name</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputFirstName" name="inputFirstName" placeholder="First Name" value="${systemUser.firstName}">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputLastName" class="col-sm-2 control-label">Last Name</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputLastName" name="inputLastName" placeholder="Last Name" value="${systemUser.lastName}">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputAddress" class="col-sm-2 control-label">Address</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputAddress" name="inputAddress" placeholder="Address" value="${systemUser.address}">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputProfilePic" class="col-sm-2 control-label">Profile Picture</label>
			    <div class="col-sm-10">
			      <input type="file" class="form-control" id="inputProfilePic" name="inputProfilePic" placeholder="Profile Picture">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputDateOfBirth" class="col-sm-2 control-label">Date of Birth</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputDateOfBirth" name="inputDateOfBirth" placeholder="Date Of Birth" value="${systemUser.dateOfBirth}">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputMobileNo" class="col-sm-2 control-label">Mobile No</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputMobileNo" name="inputMobileNo" placeholder="Mobile No" value="${systemUser.mobileNo}">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputWorkNo" class="col-sm-2 control-label">Work No</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputWorkNo" name="inputWorkNo" placeholder="Work No" value="${systemUser.workNo}">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputHomeNo" class="col-sm-2 control-label">Home No</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="inputHomeNo" name="inputHomeNo" placeholder="HomeNo" value="${systemUser.homeNo}">
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button class="btn btn-primary col-md-2 col-sm-2" type="submit" ><i class="fa fa-share"></i>Submit</button>
			    </div>
			  </div>
			</form>
		</div>
	</div>
</div>

