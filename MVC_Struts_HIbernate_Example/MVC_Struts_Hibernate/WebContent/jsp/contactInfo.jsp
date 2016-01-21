<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Personal Info</title>
</head>
<body>
	<html:form action="/proccessContactInfo.do" method="post">
		address : <html:text property="address"/> <br>
		city : <html:text property="city"/> <br>
		state : <html:text property="state"/> <br>
		country : <html:text property="country"/> <br>
		country : <html:text property="phone"/> <br>
		<input type="submit" name="submit"/>
	</html:form>
</body>
</html>