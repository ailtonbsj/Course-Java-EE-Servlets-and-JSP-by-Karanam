package br.ailtonbsj.todo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet {
	TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("todos", todoService.retrieveTodos());
		req.getRequestDispatcher("WEB-INF/views/todo.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String newTodo = req.getParameter("todo");
		todoService.AddTodo(new Todo(newTodo));
		req.setAttribute("todos", todoService.retrieveTodos());
		resp.sendRedirect("todo.do");
	}

}
