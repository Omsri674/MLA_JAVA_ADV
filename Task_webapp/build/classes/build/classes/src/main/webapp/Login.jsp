<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<h1>Login page</h1>

	<form action="loginData.jsp" method="post" >
	Enter Username:<input type="text" name="user"><br><br>
	Enter Password:<input type="password" name="pwd"><br><br>
	<br>
	<input  type="submit" value="login" style="  height: 30px;width: 50px;">
	
	</form>
	
	<br><br>New to us <a href="/Task_webapp/Register.jsp">click here</a> to be one of us....


</body>
</html>