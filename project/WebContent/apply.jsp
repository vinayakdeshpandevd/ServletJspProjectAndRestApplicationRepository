<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>apply</title>
</head>
<body style="background-color:#999999;">
<form action="apply">
<center><h1>JOB CONSULTANCY</h1></center><br>
<center><h3>Apply for job</h3></center>
<center>
<p>Firstname: <input type="text" name="firstname" required></p>
<tr><td><p>Lastname: <input type="text" name="lastname" required> </p>
<tr><td><p>University rollno: <input type="text" name="rollno" required> </p></td></tr>
<tr><td><p>Mobile: <input type="text" name="mobile" required></p></td></tr>
<tr><td><p6> Gender: </p6></td></tr>
<p>Male: <input type="Radio" name="gender" value="male"></p>
<p>Female: <input type="Radio" name="gender" value="female"></p>
 <p>Date of birth:<input type="date" name="birthday"></p>
<p>Email id:<input type="email" name="email" ></p>
<p>Qualification:<input type="text" name="qualification" ></p>
<p>Year of passing:<input type="text" name="year" ></p>
<p>Technologies known:<input type="text" name="technologies" ></td></tr></p>
<p>Applying to company:<select name="company">
  <option value="TravelTripper">TravelTripper</option>
  <option value="Amazon">Amazon</option>
  <option value="Google">Google</option>
  <option value="Cognizent">Cognizent</option>
  <option value="TCS">TCS</option>
  <option value="Wipro">Wipro</option>
  <option value="Opentext">Opentext</option>
  <option value="Capgemini">Capgemini</option>
  <option value="Optum">Optum</option>
  <option value="Infosys">Infosys</option>
</select></p>
<p>Job role:<select name="jobrole">
  <option value="Developer">Developer</option>
  <option value="QA">QA</option>
  <option value="Client support service">Client support service</option>
  <option value="UI">UI</option>
  </select></p>
<p><input type="Submit" value="Submit" ></p>
</center>
</form>
</body>
</html>