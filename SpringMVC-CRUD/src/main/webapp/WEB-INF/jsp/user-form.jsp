<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<title>User Form</title>
<style>
body {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	background-color: #f7f7f7;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.container {
	width: 400px;
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

.form-group {
	margin-bottom: 15px;
}

.form-group label {
	display: block;
	margin-bottom: 5px;
	font-weight: bold;
}

.form-control {
	width: 100%;
	padding: 10px;
	margin-bottom: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-sizing: border-box;
}

.btn {
	display: block;
	width: 100%;
	padding: 10px 0;
	margin-top: 10px;
	font-size: 16px;
	color: #fff;
	background-color: #007bff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	text-align: center;
	text-decoration: none;
}

.btn:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Employee Form</h2>
		<form:form modelAttribute="employees" 
			action="saveEmployee" method="POST">
			<div class="form-group">
				<form:hidden path="employeeId" cssClass="form-control"
					id="employeeId" />
			</div>
			<div class="form-group">
				<label for="employeeName">Name:</label>
				<form:input path="employeeName" cssClass="form-control"
					id="employeeName" />
			</div>
			<div class="form-group">
				<label for="employeeRole">Role:</label>
				<form:input path="employeeRole" cssClass="form-control"
					id="employeeRole" />
			</div>
			<div class="form-group">
				<button type="submit" class="btn">Save</button>
			</div>
		</form:form>
	</div>
</body>
</html>
