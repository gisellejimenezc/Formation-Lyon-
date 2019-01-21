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
<title>Our artists</title>
</head>
<body>
	<div class="container">
		<h1>It's our pleasure to introduce the best artists of the world!</h1><br />
				
		<c:forEach items="${list}" var="artist">
			<li>${artist.firstName}  ${artist.lastName} 
			<a href="artists/edit/${artist.id}"><button type="button" class="btn btn-primary btn-xs">Update</button></a> 
			<a href="artists/delete/${artist.id}"><button type="button" class="btn btn-danger btn-xs">Delete</button></a> 	
			<a href="artists/${artist.id}/cdsOf"><button type="button" class="btn btn-success btn-xs">Albums</button></a>	
			</li>
		</c:forEach>
		
		<br />		
		<a href="artists/add/${artist.id}"><button type="button" class="btn btn-primary btn-md">New artist</button></a>	
		<br/><br/>
		<a href="cds/add/${cd.id}"><button type="button" class="btn btn-success btn-md">New album</button></a>	
				
		
	</div>
</body>
</html>