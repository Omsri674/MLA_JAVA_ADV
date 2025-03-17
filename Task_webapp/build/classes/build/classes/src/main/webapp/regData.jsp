<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root@39");
	
	String sql = "insert into user_gmail(flname,username,password) values(?,?,?);";
		PreparedStatement pst = con.prepareStatement(sql);
		
		String fname = request.getParameter("fname");
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
		pst.setString(1, fname);
		pst.setString(2, user);
		pst.setString(3, pwd);
		
		int x = pst.executeUpdate();
		if(x >0){
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");

			rd.forward(request, response);
		}
	%>
</body>
</html>