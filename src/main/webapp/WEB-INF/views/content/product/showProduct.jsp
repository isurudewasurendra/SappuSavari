<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<style>

.rating {
    float:left;
    width:160px;
}
.rating span { float:right; position:relative; }
.rating span input {
    position:absolute;
    top:0px;
    left:0px;
    opacity:0;
}
.rating span label {
    display:inline-block;
    width:30px;
    height:30px;
    text-align:center;
    color:#FFF;
    background:#ccc;
    font-size:30px;
    margin-right:2px;
    line-height:30px;
    border-radius:50%;
    -webkit-border-radius:50%;
}
.rating span:hover ~ span label,
.rating span:hover label,
.rating span.checked label,
.rating span.checked ~ span label {
    background:#F90;
    color:#FFF;
}

.detailBox {
    border:1px solid #bbb;
    margin:50px;
}
.titleBox {
    background-color:#fdfdfd;
    padding:10px;
}
.titleBox label{
  color:#444;
  margin:0;
  display:inline-block;
}

.commentBox {
    padding:10px;
    border-top:1px dotted #bbb;
}
.commentBox .form-group:first-child, .actionBox .form-group:first-child {
    width:80%;
}
.commentBox .form-group:nth-child(2), .actionBox .form-group:nth-child(2) {
    width:18%;
}
.actionBox .form-group * {
    width:100%;
}
.taskDescription {
    margin-top:10px 0;
}
.commentList {
    padding:0;
    list-style:none;
    overflow:auto;
}
.commentList li {
    margin:0;
    margin-top:10px;
}
.commentList li > div {
    display:table-cell;
}
.commenterImage {
    width:40px;
    margin-right:5px;
    height:100%;
    float:left;
}
.commenterImage img {
    width:100%;
    border-radius:50%;
}
.commentText p {
    margin:0;
}
.sub-text {
    color:#aaa;
    font-family:verdana;
    font-size:11px;
}
.actionBox {
    border-top:1px dotted #bbb;
    padding:10px;
}

</style>

<div class="row">
	<div class="x_panel">
		<div class="x_title">
			<h2>
				${product.productTitle}<small>${product.createdDateTime}</small>
			</h2>
			<ul class="nav navbar-right panel_toolbox">
				<li><a class="collapse-link"><i	class="fa fa-chevron-up"></i></a></li>
			</ul>
			<div class="clearfix"></div>
		</div>
		<div class="x_content">
		
			<div align="right">
				<h1>Overall Rating : ${overallRating}</h1>
			</div>
		
			<c:if test="${fn:length(productMultimediaList) == 0}">
				No preview available...
			</c:if>
			<div class="slider">
				<c:forEach var="multimedia" items="${productMultimediaList}">
	    			<img src="../download/getProductImage.htm?fname=${multimedia.media}" height="600px"/>
	    		</c:forEach>
			</div>
			
			<table class="table table-striped table-bordered">
				<tr><td>${product.description}</td></tr>
			</table>
			
			<table class="table table-striped table-bordered">
				<tr>
					<td>Email</td>
					<td>Mobile</td>
					<td>Price</td>
				</tr>
				<tr>
					<th>${product.email}</th>
					<th>${product.mobile}</th>
					<th><fmt:formatNumber value="${product.price}" type="number" maxFractionDigits="3"/></th>
				</tr>
			</table>
			
			<a class="btn btn-primary btn-lg" href="../message/createMessage.htm?owner=${product.user.userId}&productId=${product.productId}">Contact Owner</a>
			
			<a class="btn btn-primary btn-lg" href="../user/followSeller.htm?userId=${product.user.userId}&proId=${product.user.userId}">Follow Seller</a>
			
			<hr/>
			<h2>Rating</h2>
			
			<div align="center">
	    		<div class="rating">
				    <span id="spanstr5"><input type="radio" name="rating" id="str5" value="5"><label for="str5"></label></span>
				    <span id="spanstr4"><input type="radio" name="rating" id="str4" value="4"><label for="str4"></label></span>
				    <span id="spanstr3"><input type="radio" name="rating" id="str3" value="3"><label for="str3"></label></span>
				    <span id="spanstr2"><input type="radio" name="rating" id="str2" value="2"><label for="str2"></label></span>
				    <span id="spanstr1"><input type="radio" name="rating" id="str1" value="1"><label for="str1"></label></span>
				</div>
			</div>
			
			<input type="hidden" id="myrating" value="${rating.rating}"/>
			
    		<div align="center">
    		<div class="detailBox">
			    <div class="titleBox">
			      <label>Comment Box</label>
			    </div>
			    <div class="commentBox">
			        <p class="taskDescription">Please add your genuine comments regarding this product or the service. This will help other to make their decision.</p>
			    </div>
			    <div class="actionBox" align="left">
			        <ul class="commentList">
			        	<c:forEach var="comment" items="${commentList}">
			        		<li>
				                <div class="commenterImage">
				                  <img src="../images/user_mock.png" />
				                </div>
				                <div class="commentText">
				                    <p class="">${comment.comment}</p> 
				                    <span class="date sub-text">${comment.user.username}(${comment.updatedDateTime})</span>
				                </div>
				            </li>
			        	</c:forEach>
			        </ul>
			        <form class="form-inline" role="form">
			            <div class="form-group">
			                <textarea id="inputComment"></textarea>
			            </div>
			        </form>
			    </div>
			</div>
    		</div>
		
		</div>
	</div>
</div>

<script type="text/javascript">

$(function($) {
	$('.slider').sss();
});

$(document).ready(function(){
	setRating();
//  Check Radio-box
    $(".rating input:radio").attr("checked", false);
    $('.rating input').click(function () {
        $(".rating span").removeClass('checked');
        $(this).parent().addClass('checked');
    });

    $('input:radio').change(function(){
        var userRating = this.value;
        //alert(userRating);
        saveRating(userRating);
    }); 
});

$("#inputComment").keypress(function(e) {
    if(e.which == 13) {
        $.post("saveComment.htm",
   	    {
   	        productId: "${product.productId}",
   	        comment: $("#inputComment").val()
   	    },
   	    function(data, status){
   	        //alert("Data: " + data + "\nStatus: " + status);
   	    	location.reload();
   	    });
        $("#inputComment").val('');
    }
});

function saveRating(rating){
	$.post("saveRating.htm",
	{
	    productId: "${product.productId}",
	    rating: rating
	},
	function(data, status){
	    //alert("Data: " + data + "\nStatus: " + status);
		location.reload();
	});
}

function setRating(){
	var rating = $("#myrating").val();
	if(rating == 1){
		$('#spanstr1 label').css('background', 'red');
	}else if(rating == 2){
		$('#spanstr2 label').css('background', 'red');
		$('#spanstr1 label').css('background', 'red');
	}else if(rating == 3){
		$('#spanstr3 label').css('background', 'red');
		$('#spanstr2 label').css('background', 'red');
		$('#spanstr1 label').css('background', 'red');
	}else if(rating == 4){
		$('#spanstr4 label').css('background', 'red');
		$('#spanstr3 label').css('background', 'red');
		$('#spanstr2 label').css('background', 'red');
		$('#spanstr1 label').css('background', 'red');
	}else if(rating ==5){
		$('#spanstr5 label').css('background', 'red');
		$('#spanstr4 label').css('background', 'red');
		$('#spanstr3 label').css('background', 'red');
		$('#spanstr2 label').css('background', 'red');
		$('#spanstr1 label').css('background', 'red');
	}
}

</script>

