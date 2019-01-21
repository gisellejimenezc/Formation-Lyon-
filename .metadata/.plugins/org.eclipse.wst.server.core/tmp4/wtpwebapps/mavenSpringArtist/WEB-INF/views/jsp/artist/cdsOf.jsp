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
<title>Albums</title>
</head>
<body>
	<div class="container">
		<h1>Nice Work ${artist.stageName} !</h1>
				
		<c:forEach items="${cdsByA}" var="cd">
			<li>${cd.title} 
			</li>
		</c:forEach>
		
		<br/>
		<spring:url value="/cds/add/${cd.id}" var="url"></spring:url>
		<a href="${url}"><button type="button" class="btn btn-danger btn-md">New album</button></a>	
				
		
	</div>
</body>
</html>