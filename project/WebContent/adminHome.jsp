<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body <%-- onload="myFunction()"--%> style="background-color:#999999;">
<center><h1>JOB CONSULTANCY</h1></center><br><br>
<center><p>${message}</p></center><br>
<%-- <c:remove var="message" scope="session" />  --%>
<center><form action="apply.jsp">
<input type="submit" value="Register candidate">
</form><br>
<form action="view.jsp">
<input type="submit" value="View applications">
</form><br>
<form action="viewall">
<input type="submit" value="View all applications">
</form><br>
<form action="edit.jsp">
<input type="submit" value="Edit applications">
</form><br>
<form action="delete.jsp">
<input type="submit" value="Delete application">
</form>
</center>

<%-- <script>
function myFunction() {
	 if('${message}'!=null && '${message}'!=''){ 
  alert('${message}');
  
	}
}
</script>  --%>

</body>

</html>