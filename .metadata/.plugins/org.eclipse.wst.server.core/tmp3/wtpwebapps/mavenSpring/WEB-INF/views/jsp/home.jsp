<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<title>Las llamas</title>
</head>
<body>

<jsp:include page="../include/hello.jsp"/>

<div class="container">

	<h1><spring:message code="index.welcome"></spring:message></h1>

	<p>${message}</p>
	
	<ul>
		<c:forEach items="${list}" var="llama">
			<li>${llama.id} : ${llama.name} 
			<a href="edit/${llama.id}"><button type="button" class="btn btn-primary btn-xs">Update</button></a>
			<a href="delete/${llama.id}"><button type="button" class="btn btn-danger btn-xs">Delete</button></a>	
			</li>
		</c:forEach>
	</ul>
	
</div>	
</body>
</html>