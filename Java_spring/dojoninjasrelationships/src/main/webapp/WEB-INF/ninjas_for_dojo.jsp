<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${specificDojo.name} page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>${specificDojo.name} Ninjas</h1>
	<table class="table table-striped">
	  <thead>
	    <tr>
	      <th scope="col">First Name</th>
	      <th scope="col">Last Name</th>
	      <th scope="col">Age</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach var="ninja" items="${specificDojo.ninjas}">
	    <tr>
	      <td scope="row"> ${ninja.firstName}</td>
	      <td>${ninja.lastName}</td>
	      <td>${ninja.age}</td>
	    </tr>
	    </c:forEach>
	  </tbody>
	</table>
</body>
</html>