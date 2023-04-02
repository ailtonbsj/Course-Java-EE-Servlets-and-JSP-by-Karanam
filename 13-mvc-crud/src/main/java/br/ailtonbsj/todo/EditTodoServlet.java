package br.ailtonbsj.todo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/edit-todo.do")
public class EditTodoServlet extends HttpServlet {
	TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("action", "edit-todo.do");
		req.setAttribute("description", req.getParameter("d"));
		req.setAttribute("category", req.getParameter("c"));
		req.getRequestDispatcher("WEB-INF/views/form-todo.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String oldDescription = req.getParameter("oldDescription");
		String oldCategory = req.getParameter("oldCategory");
		String description = req.getParameter("description");
		String category = req.getParameter("category");
		todoService.EditTodo(
				new Todo(oldDescription, oldCategory),
				new Todo(description, category));
		req.setAttribute("todos", todoService.retrieveTodos());
		resp.sendRedirect("list-todo.do");
	}

}
