<%@page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<h1>Welcome ${name}</h1>
	<a href="/03-scriptlets/?name=Jakarta">Click to pass some parameter!</a>
	
<%

System.out.println(request.getParameter("name"));
Date date = new Date();

%>

<br /><br />
<div>Current date is <%= date %></div>
	
</body>
</html>