<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title><h2>Employees List</h2></title>
<style>
body {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	background-color: #f7f7f7;
	margin: 0;
	padding: 20px;
}

.container {
	width: 80%;
	margin: 0 auto;
	padding: 20px;
	background: #fff;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	border-radius: 10px;
}

h2 {
	color: #333;
	text-align: center;
	margin-bottom: 20px;
}

.table {
	width: 100%;
	margin-bottom: 20px;
	border-collapse: collapse;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.table th, .table td {
	padding: 10px;
	text-align: left;
	border: 1px solid #ddd;
}

.table th {
	background-color: #007bff;
	color: #fff;
}

.table tr:nth-child(even) {
	background-color: #f2f2f2;
}

.btn {
	display: inline-block;
	padding: 10px 15px;
	font-size: 14px;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	text-decoration: none;
}

.btn-success {
	background-color: #28a745;
}

.btn-warning {
	background-color: #ffc107;
}

.btn-danger {
	background-color: #dc3545;
}

.btn:hover {
	opacity: 0.9;
}

.btn-container {
	text-align: center;
	margin-top: 20px;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Employees List</h2>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Role</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="employees" items="${employees}">
					<tr>
						<td>${employees.employeeId}</td>
						<td>${employees.employeeName}</td>
						<td>${employees.employeeRole}</td>
						<td><a href="updateForm?employeeId=${employees.employeeId}"
							class="btn btn-warning">Edit</a> <a
							href="delete?employeeId=${employees.employeeId}"
							class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="btn-container">
			<form action="userForm" method="POST" style="display: inline;">
				<button type="submit" class="btn btn-success">Create New
					Employee</button>
			</form>
		</div>
	</div>
</body>
</html>
