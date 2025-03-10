<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String user = request.getParameter("user");
	String pass = request.getParameter("pwd");

	if (user.equals("admin") && pass.equals("admin123")) {
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request,response);
	} else {
		
		out.println("<h3><font color='red' > Invalid Crendentials</font></h3>");
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.include(request, response);
		
	}
	%>
</body>
</html>