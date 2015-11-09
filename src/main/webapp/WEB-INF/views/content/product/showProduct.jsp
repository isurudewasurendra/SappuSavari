<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<style>

.rating {
    float:left;
    width:300px;
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

</style>

<div class="main-content">
  <div class="swipe-area"></div>
  <a href="#" data-toggle=".container" id="sidebar-toggle"> <span class="bar"></span> <span class="bar"></span> <span class="bar"></span> </a>
  <div class="content">
    	<div class="container-fluid">
    	
    		<h3>${product.productTitle}</h3>
    		
			
    		<c:forEach var="multimedia" items="${productMultimediaList}">
    			<div>
    				<img src="../download/getProductImage.htm?fname=${multimedia.media}" height="100px"/>
    			</div>
    		</c:forEach>
    		
    		<p>${product.description}</p>
    		<p>Price:${product.price}</p>
    		<p>Phone:${product.mobile}</p>
    		<p>email:${product.email}</p>
    		<p>Date:${product.createdDateTime}</p>
    		
    		-------------------------------
    		
    		<c:forEach var="comment" items="${commentList}">
    			<div>
    				<span>
    					${comment.user.username}==>
    				</span>
    				${comment.comment}
    			</div>
    		</c:forEach>
    		
    		Enter Your Comment:
    		<textarea id="inputComment"></textarea>
    		
    		<br/><br/><br/>
    		----------------------------------<br/><br/><br/>
    		My Rating
    		<div class="rating">
			    <span><input type="radio" name="rating" id="str5" value="5"><label for="str5"></label></span>
			    <span><input type="radio" name="rating" id="str4" value="4"><label for="str4"></label></span>
			    <span><input type="radio" name="rating" id="str3" value="3"><label for="str3"></label></span>
			    <span><input type="radio" name="rating" id="str2" value="2"><label for="str2"></label></span>
			    <span><input type="radio" name="rating" id="str1" value="1"><label for="str1"></label></span>
			</div>
			
			<br/><br/><br/>
			<h4>Overall Rating : ${overallRating}</h4>
			<br/><br/><br/>
			
			My rating : ${rating.rating}
			
			<br/><br/><br/>
			<a href="../message/createMessage.htm?owner=${product.user.userId}&productId=${product.productId}">Send Message To the owner</a>
    	
    	</div>
    </div>
</div>

<script type="text/javascript">

$(document).ready(function(){
//  Check Radio-box
    $(".rating input:radio").attr("checked", false);
    $('.rating input').click(function () {
        $(".rating span").removeClass('checked');
        $(this).parent().addClass('checked');
    });

    $('input:radio').change(function(){
        var userRating = this.value;
        alert(userRating);
    }); 
});

$("#inputComment").keypress(function(e) {
    if(e.which == 13) {
        alert('You pressed enter!');

        $.post("saveComment.htm",
   	    {
   	        productId: "${product.productId}",
   	        comment: $("#inputComment").val()
   	    },
   	    function(data, status){
   	        alert("Data: " + data + "\nStatus: " + status);
   	    });
        
        $("#inputComment").val('');
    }
});

</script>

