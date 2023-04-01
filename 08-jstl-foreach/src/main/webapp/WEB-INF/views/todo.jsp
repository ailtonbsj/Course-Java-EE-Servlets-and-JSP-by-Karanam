<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome ${name}!</h1>
	<p>Your todos are:</p>
	<ol>
		<c:forEach items="${todos}" var="todo">
			<li>${todo.name}</li>
		</c:forEach>
	</ol>
</body>
</html>