package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/home/log-in", "/home/beanutils", "/home/upload-file", "/home/send-mail" })
public class HomeServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();

		if (uri.contains("log-in")) {
			String username = CookieUtils.get("username", req);
			String password = CookieUtils.get("password", req);

			req.setAttribute("username", username);
			req.setAttribute("password", password);
			
			req.setAttribute("view", "/views/login.jsp");
//			req.getRequestDispatcher("/login").forward(req, resp);
//			return;
		} else if (uri.contains("beanutils")) {
			req.setAttribute("view", "/views/staff_form.jsp");
		} else if (uri.contains("upload-file")) {
//			req.getRequestDispatcher("/home/increment-hit-counter").forward(req, resp);
//			return;
			req.setAttribute("view", "/views/file_form.jsp");
		} else if (uri.contains("send-mail")) {
			req.setAttribute("view", "/views/send-mail.jsp");
		}

		req.getRequestDispatcher("/views/index.jsp").forward(req, resp);
	}
}
