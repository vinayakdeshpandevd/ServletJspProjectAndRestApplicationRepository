<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="connection.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//String uname = null;
String uid = request.getParameter("username");
String pwd = request.getParameter("password");
if(uid.equalsIgnoreCase("admin")&&pwd.equalsIgnoreCase("admin"))
{
	  
	  response.sendRedirect("adminHome.jsp");
}

else 
{
	  %><jsp:forward page="Home.jsp?msg=fail"></jsp:forward><%
}
	%>

   
 

</body>
</html>