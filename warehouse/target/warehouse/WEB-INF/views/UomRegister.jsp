<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register UOM</title>
</head>
<body>
<h2 style="color:red; text-align:center">UOM Registration</h2>
<form:form action="save" method="POST" modelAttribute="uom">
<fieldset>
    <legend>UOM</legend>
Uom Type : <form:select path="type">
 <form:option value="">-Select-</form:option>
 <form:option value="Packing">PACKING</form:option>
 <form:option value="No Packing">NO PACKING</form:option>
 <form:option value="Not Available">-NA-</form:option></form:select><br>
Uom Model:<form:input  path="model"/><br>
Description:<form:textarea path="dsc"/><br>
</fieldset>
<input type="submit" value="Create Uom"/>
</form:form>
${message}
</body>
</html>