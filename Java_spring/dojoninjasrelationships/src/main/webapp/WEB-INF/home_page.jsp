<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Add a new Dojo!!</h1>
	<form:form action="/dojo/new" method="post" modelAttribute="newDojo">
		<div class="form-group">
			<form:label path="name">Name:</form:label>
			<form:errors path="name"></form:errors>
			<form:input path="name" type="text" class="form-control"/>
		</div>
		<button type="submit" class="btn btn-primary">Create</button>
	</form:form>
	<a href="/create new ninja">Create ninjas </a>
</body>
</html>