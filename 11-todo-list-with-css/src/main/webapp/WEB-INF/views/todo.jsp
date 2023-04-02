<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css"
	rel="stylesheet">
<title>Todo List</title>
<script src="webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</head>
<body class="p-3 m-0 border-0 bd-example">

	<nav class="navbar navbar-expand-lg bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Todo App</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link" aria-current="page"
						href=".">Login</a></li>
					<li class="nav-item"><a class="nav-link active" href="#">Todos</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="http://www.in28minutes.com">In28Minutes</a></li>
				</ul>
				<form class="d-flex" role="search">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="logout.do">Logout</a></li>
					</ul>
				</form>
			</div>
		</div>
	</nav>

	<div class="container">
		<h1 style="margin-top: 10px;">Welcome ${_name}!</h1>
		<h4>Your Todo's are:</h4>
		<table class="table table-striped">
			<thead>
				<th>Description</th>
				<th>Actions</th>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.name}</td>
						<td><a class="btn btn-danger"
							href="delete-todo.do?q=${todo.name}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<form action="todo.do" method="post">
			<div class="input-group mb-3">
				<input type="text" class="form-control" name="todo">
				<button class="btn btn-success" type="submit">Add New Todo</button>
			</div>
		</form>
	</div>

</body>
</html>