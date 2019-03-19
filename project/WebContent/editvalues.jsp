<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#999999;">
<form action="update">
<center><h1>JOB CONSULTANCY</h1></center><br>
<input type=text name="firstname" value='${fname}' >
<input type=text name="lastname" value='${lname}' >
<input type=text name="mobile" value='${mobile}' >
<input type=text name="gender" value='${gender}' >
<input type=text name="birthday" value='${birthday}' >
<input type=text name="email" value='${email}' >
<input type=text name="qualification" value='${qualification}' >
<input type=text name="year" value='${year}' >
<input type=text name="technologies" value='${technologies}' >
<input type=text name="rollno" value='${rollno}' >
<input type=text name="company" value='${company}' >
<input type=text name="jobrole" value='${jobrole}' >
<input type="submit" value="update">
</form>
</body>
</html>