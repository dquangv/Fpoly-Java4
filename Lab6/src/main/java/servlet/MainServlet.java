package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/views/index", "/views/bai2", "/views/bai3", "/views/bai4" })
public class MainServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();

		if (uri.contains("bai2")) {
			req.setAttribute("view", "/views/bai2.jsp");
		} else if (uri.contains("bai3")) {
			req.setAttribute("view", "/views/bai3.jsp");
		} else if (uri.contains("bai4")) {
			req.setAttribute("view", "/views/bai4.jsp");
		}

		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
