<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>  
<body>
<h1>Your Personal Info</h1><br>
First Name : ${personalInfo.firstname}  <br>
Middle Name : ${personalInfo.middlename} <br>
Last Name : ${personalInfo.lastname} <br>
Gender : ${personalInfo.gender}<br>
<h1>Your Contact Info </h1><br>
Address : ${contactInfo.address} <br>
City : ${contactInfo.city} <br>
State : ${contactInfo.state} <br>
Country : ${contactInfo.country} <br>
Phone : ${contactInfo.phone}   <br>
<h1>Your Bank Info</h1><br> 
Bank Name : ${bankInfo.bankname}   <br>
Account : ${bankInfo.account}   <br>
SSN : ${bankInfo.ssn}   <br>
</body>
</html>