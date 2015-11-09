<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0;"> 
<title></title>

	<link rel="stylesheet" type="text/css" href="<c:url value="/style/bootstrap.css"/>" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/style/swipe.css"/>" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/style/jquery-ui.css"/>" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/style/css.css"/>" />

	<script type="text/javascript" src="<c:url value="/js/jquery-2.1.4.js"/> "></script>
	<script type="text/javascript"  src="<c:url value="/js/jquery-ui.js"/> "></script>
	<script type="text/javascript" src="<c:url value="/js/bootstrap.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/jquery.touchSwipe.min.js"/>"></script>

</head>
<body>
	<div class="container">
		<div id="topnavbar"><tiles:insertAttribute name="topnavbar-position"/></div>
		<div id="header"><tiles:insertAttribute name="header-position"/></div>
		<div id="midnavbar"><tiles:insertAttribute name="midnavbar-position"/></div>
		<div id="body"><tiles:insertAttribute name="body-position"/></div>
		<div id="footer"> <tiles:insertAttribute name="footer-position"/></div>  
    </div>
</body>
</html>