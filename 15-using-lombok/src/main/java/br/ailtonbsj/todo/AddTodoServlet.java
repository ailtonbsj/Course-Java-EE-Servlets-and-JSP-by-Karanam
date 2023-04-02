package br.ailtonbsj.todo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet {
	TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("action", "add-todo.do");
		req.setAttribute("linkAddTodo", " active");
		req.getRequestDispatcher("WEB-INF/views/form-todo.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String description = req.getParameter("description");
		String category = req.getParameter("category");
		todoService.AddTodo(new Todo(description, category));
		req.setAttribute("todos", todoService.retrieveTodos());
		resp.sendRedirect("list-todo.do");
	}

}
