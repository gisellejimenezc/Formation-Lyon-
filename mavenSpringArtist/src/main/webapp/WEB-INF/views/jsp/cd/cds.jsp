<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>The best albums in the world</title>
</head>
<body>
<div class="container">
		<h1>Please, go ahead and enjoy the best music of the world!</h1>
				
		<c:forEach items="${cds}" var="cd">
			<li>${cd.title}  ${cd.artist}
				<a href="artists/edit/${cd.id}"><button type="button" class="btn btn-primary btn-xs">Update</button></a> 
				<a href="artists/delete/${cd.id}"><button type="button" class="btn btn-danger btn-xs">Delete</button></a> 	
			</li>
		</c:forEach>
		
		<a href="cds/add/${cd.id}"><button type="button" class="btn btn-success btn-md">New album</button></a>	
		
		
	</div>
</body>
</html>