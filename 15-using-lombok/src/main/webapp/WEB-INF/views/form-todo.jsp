<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<h1 style="margin-top: 10px;">Welcome ${_name}!</h1>

	<form action="${action}" method="post">
		<div class="mb-3">
			<label for="description" class="form-label">Description</label> <input
				type="text" class="form-control" name="description" id="description"
				placeholder="Description" value="${description}"> <input
				type="hidden" name="oldDescription" value="${description}">
		</div>
		<div class="mb-3">
			<label for="category" class="form-label">Category</label> <input
				type="text" class="form-control" name="category" id="category"
				placeholder="Category" value="${category}"> <input
				type="hidden" name="oldCategory" value="${category}">
		</div>
		<div class="mb-3">
			<button class="btn btn-success" type="submit">Save Todo</button>
		</div>
	</form>
</div>

<%@ include file="../common/footer.jspf"%>