<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OrderMethod Registration Page</title>
</head>
<body>
	<h2 style="color: red; text-align: center">OrderMethod
		Registration</h2>
	<form:form action="save" method="POST" modelAttribute="orderMethod">
		<fieldset>
			<legend>OrderMethod</legend>
			<br> Order Mode :
			<form:radiobutton path="mode" value="sale" />
			Sale
			<form:radiobutton path="mode" value="purchase" />
			Purchase<br> Order Code:
			<form:input path="code" />
			<br> Order Method :
			<form:select path="method">
				<form:option value="">-Select-</form:option>
				<form:option value="FIFO">FIFO</form:option>
				<form:option value="LIFO">LIFO</form:option>
				<form:option value="FCFO">FCFO</form:option>
				<form:option value="FEFO">FEFO</form:option>
			</form:select>
			<br> Order Accept:
			<form:checkbox path="accept" value="MM" />
			Multi-Model&nbsp;&nbsp;
			<form:checkbox path="accept" value="AR" />
			Accept Return<br> Description:
			<form:textarea path="dsc" />
			<br>
		</fieldset>
		<input type="submit" value="Create OrderMethod" />
	</form:form>
	${message}
</body>
</html>