<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertProduct" method="post"> 
Product id <input type="text" name="pid" id="pid"><br>
Product name <input type="text" name="pname" id="pname"><br>
Product Quantity <input type="text" name="qty" id="qty"><br>
Product price <input type="text" name="price" id="price"><br>
<button type="submit" name="btn" value="add">Add Product</button>
</form>
</body>
</html>