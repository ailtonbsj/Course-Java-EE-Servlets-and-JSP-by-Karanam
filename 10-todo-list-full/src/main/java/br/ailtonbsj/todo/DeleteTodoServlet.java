package br.ailtonbsj.todo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {
	TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		todoService.DeleteTodo(new Todo(req.getParameter("q")));
		resp.sendRedirect("todo.do");
	}

}
