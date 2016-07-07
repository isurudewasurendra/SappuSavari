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
				if(e.value+1 == 1){
					return  "Mobile(${mobileConfident}%)";
				}else if(e.value+1 == 2){
					return  "Mobile Accessories(${mobileAccessoriesConfident}%)";
				}else if(e.value+1 == 3){
					return  "Computer(${computerConfident}%)";
				}else if(e.value+1 == 4){
					return  "Computer Accessories(${computerAccessoriesConfident}%)";
				}else if(e.value+1 == 5){
					return  "Camera(${cameraConfident}%)";
				}else if(e.value+1 == 6){
					return  "Camera Accessories(${cameraAccessoriesConfident}%)";
				}else if(e.value+1 == 7){
					return  "TV(${tvConfident}%)";
				}else if(e.value+1 == 8){
					return  "Audio(${audioConfident}%)";
				}else if(e.value+1 == 9){
					return  "Refrigerator(${refrigeratorConfident}%)";
				}
				else{
					return "Product Type" + (e.value+1);
				}
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
		},
		{
			type: "line", //change it to line, area, column, pie, etc
			dataPoints: [
				<c:forEach var="data" items="${datamap}">
				{ y: ${confident} },
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
</body>

</html>