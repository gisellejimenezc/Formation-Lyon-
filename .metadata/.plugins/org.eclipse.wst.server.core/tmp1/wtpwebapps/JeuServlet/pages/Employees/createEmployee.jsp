<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form method= "POST" action="">
			<div class="form-group">
			<input type="hidden" name="id" value="${employee.id}"><br><br>
			   Name:<br>
			  <input type="text" name="name" value="${employee.name}"><br><br>
			  <input type="submit" value="Submit">
			 </div>
		 </form>
	</div>
</body>
</html>