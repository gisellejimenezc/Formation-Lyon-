<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>List of employees</title>
</head>
<body>
<div class="container">

	<h1>List of employees:</h1>
	<ul>
		<c:forEach items="${employeesList}" var="employee">
			<li>${employee.id} : ${employee.name} <a href="?action=update&id=${employee.id}"><button type="button" class="btn btn-primary btn-xs">Update</button></a>
									<a href="?action=delete&id=${employee.id}"><button type="button" class="btn btn-danger btn-xs">Delete</button></a></li>
		</c:forEach>
	</ul>
	
	
	<a href="?action=create"><button type="button" class="btn btn-info">New employee</button></a>

</div>	
</body>
</html>