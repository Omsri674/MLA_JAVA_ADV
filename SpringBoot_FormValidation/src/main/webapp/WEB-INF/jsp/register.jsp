<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

<style type="text/css">
		.form-container {
  position:fiexd;
  width:50%;
  margin-left: 20px;
  margin-top: 20px;
  margin-bottom: 20px;
  padding: 20px;
  background-color: #E8E1E1;
  border: 1px solid #ddd;
  border-radius: 4px;
}

.floatRight{
	float:right;
	margin-right: 18px;
}

.has-error{
	color:red;
}


.success{
  position:fiexd;
  width:50%;
  margin-left: 50px;
  margin-top:20px;
  padding: 20px;
  background-color: #E8E1E1;
  border: 1px solid #ddd;
  border-radius: 4px;
}

.tr:nth-child(even) {background-color: #f2f2f2;}

	body {
    background-color: lightblue;
}

h1 {
    color: navy;
    margin-left: 20px;
}

table {
    width:100%;
   
}
table, th, td {
    
    border-collapse: collapse;
    
}
th, td {
    padding: 5px;
    text-align: left;
}
table#t01 tr:nth-child(even) {
    background-color: #eee;
   
}
table#t01 tr:nth-child(odd) {
   background-color:#fff;
   
}
table#t01 th {
    background-color: blue;
    color: white;
    text-align: center;
}


table#t02 td {
    
    vertical-align: inherit;
    text-align: center;
}
table#t02 tr:nth-child(even) {
    background-color: #eee;
    
   
}
table#t02 tr:nth-child(odd) {
   background-color:#fff;
   
}
table#t02 th {
    
    background-color: lightblue;
    text-align: center;
}


h1 {
    text-align: center;
    display: block;
    font-size: 2em;
    margin-top: 0.67em;
    margin-bottom: 0.67em;
    margin-left: 0;
    margin-right: 0;
    font-weight: bold;
    color:blue;
}
h2 {
    text-align: left;
    display: block;
    font-size: 1em;
    margin-top: 0.67em;
    margin-bottom: 0.67em;
    margin-left: 0;
    margin-right: 0;
    font-weight: bold;
    color:#008040;
}
a {
   
    font-weight: bold;
    color:blue;
}

button {
		padding: 10px;
	}
	.error {
		color: red;
		font-style: italic;
	}
	form {
		display: table;
	}
	form div {
		display: table-row;
	}
	label, input, span, select {
		display: table-cell;
		margin: 5px;
		text-align: left;		
	}
	input[type=text], input[type=password], select, textarea {
		width: 200px;
		margin: 5px;
	}

	form div div {
		display: table-cell;
	}
	</style>
	
	
	
</head>

<body>
<div align="center">
		<h3 id = "h2">User Reservation Form</h3>
<p id="error" style="color:red; font-size: large; font-weight: bold;">${error}</p>
	<form:form action="register" modelAttribute="user" method="post">
		<div>
			<form:label path="fname">First name:</form:label>
			<form:input id = "fname" path="fname" />
			<form:errors path="fname" cssClass="error" />
			</div>
		<div>
			<form:label path="lname">Last name:</form:label>
			<form:input id = "lname" path="lname" />
			<form:errors path="lname" cssClass="error" />
			</div>
		<div>
			<form:label path="gender">Gender:</form:label>
		
		Male<form:radiobutton id = "gender1" path="gender" value="Male" />
		Female<form:radiobutton id = "gender2" path="gender" value="Female" />
		<form:errors path="gender" cssClass="error" />	
		</div>
		<div>
		<form:label path="food">Food:</form:label>
		
		BreakFast<form:checkbox id = "f1" path="food" value="BreakFast"/>
		Lunch<form:checkbox id = "f2" path="food" value="Lunch"/>
		Dinner<form:checkbox  id = "f3" path="food" value="Dinner"/>
		<form:errors path="food" cssClass="error" />
		</div>
		<div>
		<form:label path="cityfrom">Leaving From:</form:label>
		
		 <form:select id = "from" path="cityfrom" >
		 <form:option value="" label="Select City"/>
		<form:option value="Hyderabad" label="Hyderabad"/>
		<form:option value="Tirupati" label="Tirupati"/>
		<form:option value="Chennai" label="Chennai"/>
		<form:option value="Bengalore" label="Bengalore"/>
		</form:select>
		<form:errors path="cityfrom" cssClass="error" />
		</div>
		<div>
		<form:label path="cityto">Going To:</form:label>
		
		<form:select id = "to" path="cityto" >
		<form:option value="" label="Select City"/>
		<form:option value="Bengalore" label="Bengalore"/>
		<form:option value="Hyderabad" label="Hyderabad"/>
		<form:option value="Tirupati" label="Tirupati"/>
		<form:option value="Chennai" label="Chennai"/>
		</form:select>
		<form:errors path="cityto" cssClass="error"/>
		</div>
		
		<div>
			<form:label path="startDate">Journey Date:</form:label>
			<form:input type="date" id = "jdate" path="startDate" class="date-picker" placeholder="dd/MM/yyyy"/>
			<form:errors path="startDate" cssClass="error" />
		</div>
		
		<div>
		<form:label path="seat">Seats:</form:label>
		
		M1<form:checkbox id = "seat1" path="seat" value="Middle Berth : M1" />
		M2<form:checkbox id = "seat2" path="seat" value="Middle Berth : M2" />
		L1<form:checkbox id = "seat3" path="seat" value="Lower Berth : L1" />
		L2<form:checkbox id = "seat4" path="seat" value="Lower Berth : L2" />
		U1<form:checkbox id = "seat3" path="seat" value="Upper Berth : U1" />
		U2<form:checkbox id = "seat4" path="seat" value="Upper Berth : U2" />
		<form:errors path="seat" cssClass="error" />	
		</div>
		
		<input type="submit" id = "submit" value="Submit" />
	</form:form>
	</div>
	
</body>
</html>
