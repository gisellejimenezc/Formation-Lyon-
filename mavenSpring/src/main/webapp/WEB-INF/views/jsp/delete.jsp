<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete llama</title>
</head>
<body>
<div class="container">

<form:form method="post" action="delete" modelAttribute="ids">
	<table>
		<tr>
			<td><form:label path="id">Id</form:label></td>
			<td><form:input path="id" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Delete llama"></td>
		</tr>
	</table>
</form:form>

</div>

</body>
</html>