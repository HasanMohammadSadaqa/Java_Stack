<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
	<h1>Add a new ninja</h1>
	<form:form action="/ninjas/new" method="post" modelAttribute="newNinja">
		<form:select class="form-select" aria-label="Default select example" path="dojo">
		<c:forEach var="dojo" items="${dojos}">
			<form:option value="${dojo.id}" path="dojo">
				<c:out value="${dojo.name}"></c:out>
			</form:option>
		</c:forEach>
		</form:select>
		<div class="form-group">
			<form:label path="firstName">First Name:</form:label>
			<form:errors path="firstName"></form:errors>
			<form:input path="firstName" type="text" class="form-control"/>
		</div>
		<div class="form-group">
			<form:label path="lastName">Last Name:</form:label>
			<form:errors path="lastName"></form:errors>
			<form:input path="lastName" type="text" class="form-control"/>
		</div>
		<div class="form-group">
			<form:label path="age">Age:</form:label>
			<form:errors path="age"></form:errors>
			<form:input path="age" type="number" class="form-control"/>
		</div>
		<button type="submit" class="btn btn-primary">Create</button>
	</form:form>
</body>
</html>