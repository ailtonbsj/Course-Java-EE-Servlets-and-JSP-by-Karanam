<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome ${_name}!</h1>
	<p>Your todos are:</p>
	<ol>
		<c:forEach items="${todos}" var="todo">
			<li>${todo.name}</li>
		</c:forEach>
	</ol>

	<hr>
	
	<h2>${name}!</h2>
	
	<h2>Cookies</h2>
	<dl>
		<c:forEach items="${cookie}" var="cookieEntry">
			<dt>
				<c:out value="${cookieEntry.key}" />
			</dt>
			<dd>
				<c:out value="${cookieEntry.value.value}" />
			</dd>
		</c:forEach>
	</dl>

	<h2>Session attributes</h2>
	<dl>
		<c:forEach items="${sessionScope}" var="sessionEntry">
			<dt>
				<c:out value="${sessionEntry.key}" />
			</dt>
			<dd>
				<c:out value="${sessionEntry.value}" />
			</dd>
		</c:forEach>
	</dl>

</body>
</html>