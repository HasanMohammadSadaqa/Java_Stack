<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Fruity Store</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>

<body>
	<h2 class="container-sm mt-5 w-50">Fruity Store</h2>
	<div class="container-md mt-4 w-50">
	    <table>
	        <thead>
	            <th>Name</th>
	            <th>Price</th>
	        </thead>
	        <tbody>
	        <c:forEach var="fruit" items="${fruitsfromcontroller}">
	            <tr>
	                <td> <c:out value="${fruit.name}"></c:out> </td>
	                <td> <c:out value="${fruit.price}"></c:out> </td>
	            </tr>
	         </c:forEach>
	        </tbody>
	    </table>
	  </div>
</body>

</html>