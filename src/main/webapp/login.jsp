<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><html>
<head>
</head>
<body>
<h2>Example with query parameters</h2>
<br>
<br>
<br>
<a> first name: <c:out value="${param.first_name}"/> </a>
<a> last name: <c:out value="${param.last_name}"/> </a>
</body>
</html>