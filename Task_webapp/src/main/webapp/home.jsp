<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>


<style type="text/css">
#cmp_img {
	height: 100px;
	width: 160px;
}

#header {
	background-color: #CECECE;
	display: flex;
	justify-content: space-between;
}

li {
	margin: 10px;
	display: inline-flex;
	font-size: 30px;
	padding-left: 50px;
	padding-right: 50px;
	  
	
}

ul {
	list-style-type: none;
}
</style>

</head>
<body>
	<div id="header">
		<img id="cmp_img"
			src="https://eswartherapeutics.com/wp-content/uploads/2024/06/QuickFinXpert-1.png"
			alt="hello">
		<ul style="display: flex;">
			<li>Home</li>
			<li>About</li>
			<li>Services</li>
			<li>Team</li>
			
		</ul>
		
		<a  href="/Task_webapp/Login.jsp"><img style="width: 100px; height: 100px; border-radius: 150px;" src="data:image/png;base64,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" alt="hello"></a>
	</div>
</body>
</html>

