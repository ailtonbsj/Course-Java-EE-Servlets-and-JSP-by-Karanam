<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<h1 style="margin-top: 10px;">Welcome ${_name}!</h1>
<h4>Your Todo's are:</h4>
<table class="table table-striped">
	<thead>
		<th>Description</th>
		<th>Category</th>
		<th width="150px">Actions</th>
	</thead>
	<tbody>
		<c:forEach items="${todos}" var="todo">
			<tr>
				<td>${todo.name}</td>
				<td>${todo.category}</td>
				<td><a class="btn btn-primary"
					href="edit-todo.do?d=${todo.name}&c=${todo.category}">Edit</a>
					<button class="btn btn-danger"
						onclick="remove('${todo.name}','${todo.category}')">Delete</button>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<%@ include file="../common/footer.jspf"%>