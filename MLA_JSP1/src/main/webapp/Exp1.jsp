<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NONAME</title>
</head>
<body>


	<!-- declartion tag -->
	<%!int x = 10;
	int y = 20;

	public int add() {
		return x + y;

	}%>
	


	<!--  expression tag -->

	<%=add()%>
	
	<!-- scriplet tag -->
	
	<br>
	
	<%
		out.println(add());
	
	
		out.println("<br><br> Current System Date: "+new Date());
	%>

</body>
</html>