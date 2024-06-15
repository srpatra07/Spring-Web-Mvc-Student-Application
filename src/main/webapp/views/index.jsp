<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
	<h2>Student Enquiry Form</h2>
	
	<p><font color="green">${status }</font></p>

	<form:form action="save" modelAttribute="student" method="post">
		<table>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><form:radiobutton path="gender" value="M" /> Male <form:radiobutton
						path="gender" value="F" /> Female</td>
			</tr>
			<tr>
				<td>Course</td>
				<td><form:select path="course">
					<form:option value="">-Select-</form:option>
					<form:options items="${courses}"/>
				</form:select>
				</td>
			</tr>
			<tr>
				<td>Timings</td>
				<td><form:checkbox path="timings" value="morning" /> Morning <form:checkbox
						path="timings" value="noon" /> Noon <form:checkbox path="timings"
						value="evening" /> Evening</td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>