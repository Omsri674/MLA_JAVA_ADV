<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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

Class.forName("com.mysql.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root@39");
	
	String sql = "select username,password from user_gmail where username = ? AND password = ?;";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, user);
		pst.setString(2, pass);
		
		ResultSet rs = pst.executeQuery();
		String res_user = new String(); 
		String res_pwd = new String();
		while(rs.next()){
			 res_user = rs.getString(1);
			 res_pwd = rs.getString(2);
		}
		
		
		if(res_user.equals(user) && res_pwd.equals(pass)){
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");

			rd.forward(request, response);
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			out.println("<h3 color='red'>Invalid User Credentials</h3>");
			rd.include(request, response);
		}
		
		
	%>
</body>
</html>
</body>
</html>