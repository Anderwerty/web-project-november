<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Accounts</title>
</head>

<body>
<table>
  <tr>
    <th>id</th>
    <th>iban</th>
    <th>amount</th>
  </tr>
  <c:forEach items="${accounts}" var="account">
    <tr>
      <td>Account ID: <c:out value="${account.id}"/></td>
      <td>Account iban: <c:out value="${account.iban}"/></td>
      <td>Account amount: <c:out value="${account.amount}"/></td>
    </tr>
  </c:forEach>
</table>
      <form action = "login" method = "GET">
         First Name: <input type = "text" name = "first_name">
         <br />
         Last Name: <input type = "text" name = "last_name" />
         <input type = "submit" value = "Submit"/>
      </form>
      <br/>
      <br/>
      <br/>

      <form action = "login2" method = "POST">
         First Name: <input type = "text" name = "first_name">
         <br />
         Last Name: <input type = "text" name = "last_name" />
         <input type = "submit" value = "Submit"/>
      </form>
</body>
</html>