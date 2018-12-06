<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShipmentType Registration Page</title>
</head>
<body>
<h2 style="color:red; text-align:center">ShipmentType Registration</h2>
<form:form action="save" method="POST" modelAttribute="shipmentType">
<fieldset>
    <legend>ShipmentType</legend><br>
    
Shipment Mode : <form:select path="mode">
 <form:option value="">-Select-</form:option>
 <form:option value="Air">Air</form:option>
 <form:option value="Truck">Truck</form:option>
 <form:option value="Ship">Ship</form:option>
 <form:option value="Train">Train</form:option>
 </form:select><br>
 
Shipment Code:<form:input  path="code"/><br>
Enable Shipment <form:checkbox path="enabled" value="Yes"/>Yes<br>
Shipment Grade <form:radiobutton path="grade" value="A"/>A
<form:radiobutton path="grade" value="B"/>B
<form:radiobutton path="grade" value="C"/>C<br>
Description:<form:textarea path="dsc"/><br>
</fieldset>
<input type="submit" value="Create Shipment"/>
</form:form>
${message}
</body>
</html>