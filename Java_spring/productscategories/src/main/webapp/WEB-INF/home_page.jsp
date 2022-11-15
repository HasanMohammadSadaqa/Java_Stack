<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-md w-50">
		<h1 class="text-center my-4">Home Page</h1>
		<div class="d-flex justify-content-around">
			<a href="/products/new" class="btn btn-primary my-2">New Product</a>
			<a href="/categories/new" class="btn btn-primary my-2">New Category</a>
		</div>
		<hr>

        <table class="table table-hover container-md mt-2">
            <thead>
                <tr>
                    <th scope="col">Products</th>
                    <th scope="col">Categories</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
           		    	<ul>
                   			<c:forEach var="product" items="${allProducts}">
                    			<li><a href="/products/${product.id}"><c:out value="${product.name}"></c:out></a></li>
                    		</c:forEach>
                   		</ul>
                    </td>
                    <td>
           		    	<ul>
                   			<c:forEach var="category" items="${allCategories}">
                    			<li><a href="/categories/${category.id}"><c:out value="${category.name}"></c:out></a></li>
                    		</c:forEach>
                   		</ul>
                    </td>
                </tr>
            </tbody>
        </table>
	</div>
</body>
</html>