<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>

<head>
<title>CanvasJS Chart jQuery Plugin</title>
<script src="<c:url value="/js/jquery.min.js"/>"></script>
<script src="<c:url value="/js/graphs/jquery.canvasjs.min.js"/>"></script>
<script type="text/javascript">
$(function () {
	//Better to construct options first and then pass it as a parameter
	var options = {
		title: {
			text: "${title}"
		},
        animationEnabled: true,
        axisX:{
			labelFormatter: function(e){
				return  "Product type " + (e.value+1);
			},
			interval: 1
		},
		data: [
		{
			type: "splineArea", //change it to line, area, column, pie, etc
			dataPoints: [
				<c:forEach var="data" items="${datamap}">
				{ y: ${data.value} },
				</c:forEach>
			]
		}
		]
	};

	$("#chartContainer").CanvasJSChart(options);

});
</script>
</head>
<body>
<div id="chartContainer" style="height: 500px; width: 100%;"></div>
<hr/>
Legend<br/>
<c:forEach var="data" items="${legenddatamap}">
	Product type ${data.key} : ${data.value} <br/>
</c:forEach>
<hr/>
</body>

</html>