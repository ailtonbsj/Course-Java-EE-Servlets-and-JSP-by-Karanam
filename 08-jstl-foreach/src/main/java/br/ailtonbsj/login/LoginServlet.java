package br.ailtonbsj.login;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	LoginService loginService = new LoginService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("login");
		String pass = req.getParameter("password");	
		boolean isValid = loginService.isUserValid(login, pass);
		
		if(isValid) {
			resp.sendRedirect("todo.do?name=" + login);
		} else {
			req.setAttribute("errorMsg", "Invalid user or password!");
			req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
		}
	}
}
