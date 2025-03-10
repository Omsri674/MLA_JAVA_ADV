<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order</title>
</head>
<body>

	<h3> Order Details</h3>
	<form action="orderData.jsp">
	Enter Order Id: <input type="text" name="id"><br><br>
		Enter Product name:<input type="text" name="name"><br><br>
		Enter Product description:<input type="text" name="descp"><br><br>
		Enter Product quantity:<input type="text" name="qty"><br><br>
		
		<input type="submit" value="Place order">
</form>
</body>
</html>