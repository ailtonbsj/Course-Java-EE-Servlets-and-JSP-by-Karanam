<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP</title>
	<style>
	label {
		display: inline-block;
		width: 75px;
	}
	.group {
		margin: 10px 0;
	}
	.error {
		color: white;
		background-color: #dc3545;
		border-radius: 5px;
	}
	</style>
</head>
<body>
	<div class="error">${errorMsg}</div>
	<form action="/07-redirect-servlets/" method="post">
		<div class="group">
			<label for="login">Login</label>
			<input type="text" name="login" id="login">
		</div>
		<div class="group">
			<label for="password">Password</label>
			<input type="password" name="password" id="password">
		</div>
		<button>Login</button>
	</form>
</body>
</html>