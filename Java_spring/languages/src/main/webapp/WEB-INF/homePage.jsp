<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<table class="table table-striped">
	  <thead>
	    <tr>
	      <th scope="col">Name</th>
	      <th scope="col">Creator</th>
	      <th scope="col">Version</th>
	      <th scope="col">Action</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach var="language" items="${allLanguages}">
	    <tr>
	      <td> ${language.name} </td>
	      <td>${language.creator}</td>
	      <td>${language.version}</td>
	      <td><a href="/">Delete </a> | <a href="/">Edit </a></td>
	    </tr>
	    </c:forEach>
	  </tbody>
	</table>
	<form:form action="/languages" method="post" modelAttribute ="newLanguage">
	<div class="form-group">
		<form:label path="name">Name:</form:label>
		<form:errors path="name"/>
		<form:input path="name" class="form-control"/>
	</div>
	<div class="form-group">
		<form:label path="creator">Creator:</form:label>
		<form:errors path="creator"/>
		<form:input path="creator" class="form-control"/>
	</div>
	<div class="form-group">
		<form:label path="Version">Versoin:</form:label>
		<form:errors path="Version"/>
		<form:input path="Version" class="form-control"/>
	</div>
	<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
	</body>
</html>