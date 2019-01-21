<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<title>Let's make a new album together!</title>
</head>
<body>
	<div class="container">
	
	<h1>Let's share a new creation!</h1></br>
	
	<spring:url value="/cds/processFormCD" var="processUrl"/>
	
		<form:form method="post" action="${processUrl}" modelAttribute="cd">
			<form:input path="id" type="hidden"/>
			
			<spring:hasBindErrors name="cd">
			<c:set var="errorClass" value="border:1px solid red;"></c:set> 
			</spring:hasBindErrors>
			<form:label path="title">Title</form:label>
			<form:input path="title" />
			<form:errors path="title" type="text" style="${errorClass}"/>
			
			<form:label path="style">Style</form:label>
			<form:select path="style" items="${styles}">
				<c:forEach items="${styles}" var="style">
					<form:option value="${styles}">${styles}
					</form:option>
					</c:forEach>
			</form:select>  
			
			<form:label path="tracks">Tracks</form:label>
			<form:input path="tracks" />
			
			<label for=artist>Artist</label>
			<form:select path="artist.id" items="${artists}" itemlabel="stageName" itemValue="id" class="form-control"/>
			
			<input type="submit" value="New album">
		</form:form>
	
	</div>

</body>
</html>