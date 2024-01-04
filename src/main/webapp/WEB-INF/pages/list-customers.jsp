<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Of Customers</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>

	<div id="wrapper" align="center">
		<div id="header">
			<h2 style="color: green;">CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container" align="center">
		<div id="content">

			<!-- Button to Add Customer--> 
			<input type="button" value="Add Customer" 
				onclick="window.location.href='./showForm'; return false;" class="add-button" />
			

			<table border="1">
				<tr style="background-color: coral;">
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email ID</th>
				</tr>

				<tr>
					<td>${customers.get(0).firstName}</td>
					<td>${customers.get(0).lastName}</td>
					<td>${customers.get(0).email}</td>
				</tr>

				<tr>
					<td>${customers.get(1).firstName}</td>
					<td>${customers.get(1).lastName}</td>
					<td>${customers.get(1).email}</td>
				</tr>

				<tr>
					<td>${customers.get(2).firstName}</td>
					<td>${customers.get(2).lastName}</td>
					<td>${customers.get(2).email}</td>
				</tr>

				<tr>
					<td>${customers.get(3).firstName}</td>
					<td>${customers.get(3).lastName}</td>
					<td>${customers.get(3).email}</td>
				</tr>

			</table>

		</div>
	</div>
</body>
</html>