<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Credentials Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        .form-container h2 {
            margin-top: 0;
            text-align: center;
        }
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>User Form</h2>
        <form:form modelAttribute="user" method="post" action="submitForm">
            <div>
                <form:label path="username">Name:</form:label>
                <form:input path="username" />
                <form:errors path="username" cssClass="error" />
            </div>
            <div>
                <form:label path="password">Password:</form:label>
                <form:password path="password" />
                <form:errors path="password" cssClass="error" />
            </div>
            <div>
                <input type="submit" value="Submit" />
            </div>
        </form:form>
    </div>
</body>
</html>
