<%
String  message = "index.jsp example";

%>

<%!
int factorial(int n){
  return n== 0 ? 1 : n*factorial(n-1);
}
%>

<%@ page import="java.time.LocalDateTime, java.time.LocalDate" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    <style>
body      {background-color: powderblue;}
h1        {color: blue;}
iframe    {color: red;}
p         {color: blue;}

    </style>
</head>
<body>
 <jsp:include page = "base_header.jsp"/>
 <h1> Clip </h1>
<iframe width="560" height="315" src="https://www.youtube.com/embed/mOOClonYKmc" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
<p> <%= message %> </p>
<p> current date :  <%=  LocalDate.now() %> </p>
<p> current date :  <%=  LocalDateTime.now() %> </p>

<%
     for(int i = 0; i<10; i++){
       out.println("<br>");
     }




%>

<p>  =================================== </p>
<p> factorial 5 = <%= factorial(5) %> </p>

 <jsp:include page = "footer.jsp"/>

</body>
</html>