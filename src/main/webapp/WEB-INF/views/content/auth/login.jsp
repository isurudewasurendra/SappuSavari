<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>



<div class="wrapper">
   <form class="form-signin" name="f" action='<c:url value="../login/login_check" />' method="POST" >      
     <h2 class="form-signin-heading">Please login</h2>
     <input id="username" type='text' name='username' class="form-control" placeholder="Email Address" />
     <input id="password" type='password' name='password' class="form-control" placeholder="Password"/>      
     <label class="checkbox">
       <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
     </label>
     <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
     <a href="signup.htm"><button class="btn btn-lg btn-primary btn-block" type="button">SignUp</button></a>
   </form>
 </div>