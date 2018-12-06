<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WhUserType Registration Page</title>
<script type="text/javascript">
function doForType(radio) {
    switch (radio.value) {
    case "vendor":
           document.getElementById("forType").value = "purchase";
        break;
    case "customer":
        document.getElementById("forType").value = "sale";
     break;
    }
}
function doIfOther(idType){
	 switch (idType.value)
	 {
	 case "PAN":
     document.getElementById("ifOther").disabled=true;
  	 break;
	 case "VOTER":
	     document.getElementById("ifOther").disabled=true;
	  	 break;
	 case "ADHAAR":
	     document.getElementById("ifOther").disabled=true;
	  	 break;
	 case "Other":
         document.getElementById("ifOther").disabled=false;
      break;
	 }
}
</script>
</head>
<body>
	<h2 style="color: red; text-align: center">WhUserType Registration</h2>
	<form:form action="save" method="POST" modelAttribute="whUserType">
		<fieldset>
		<pre>
		<legend>WhUserType</legend>
		User Type    : <form:radiobutton path="type" value="vendor" onclick="doForType(this);"/>vendor<span id="type"></span> <form:radiobutton path="type" value="customer" onclick="doForType(this);"/>customer<span id="type"></span><br> 
		User Code    :  <form:input path="code" /><br> 
		User for     :  <form:input path="forType" disabled="true" /><span id="forType"></span>
		[auto fill]<br>
		User Email   :  <form:input path="email"/><br>
		User Contact :  <form:input path="contact"/><br>
		UserId Type  :  <form:select path="idType" onclick="doIfOther(this);">
				<form:option value="">-Select-</form:option>
				<form:option value="PAN">PAN CARD</form:option>
				<form:option value="ADHAAR">ADHAAR</form:option>
				<form:option value="VOTER">VOTER ID</form:option>
				<form:option value="Other">OTHER</form:option>
			</form:select><span id="idType"></span><br> 
		* If Other   :  <form:input path="ifOther" disabled="true"/><span id="ifOther"></span><br>
		ID Number    :  <form:input path="idNumber"/>	
		<br><br>
				<input type="submit" value="Create OrderMethod" />	
		</pre>	
		</fieldset>
		
	</form:form>
	${message}
</body>
</html>