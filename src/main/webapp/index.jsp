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
    <style>
body      {background-color: powderblue;}
h1        {color: blue;}
iframe    {color: red;}
p         {color: blue;}

    </style>
</head>
<body>
 <jsp:include page = "header.jsp"/>
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