package br.ailtonbsj;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("login");
		String pass = req.getParameter("password");
		boolean isValid = UserValidationService.isUserValid(login, pass);
		if(isValid) {
			req.setAttribute("login", login);
			req.getRequestDispatcher("WEB-INF/views/welcome.jsp").forward(req, resp);
		} else {
			req.setAttribute("errorMsg", "Invalid user or password!");
			req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
		}
	}
	
}
