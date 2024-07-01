package com.poly.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/home/tam-giac", "/home/dang-ky", "/home/hit-counter"})
public class HomeServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();

		if (uri.contains("tam-giac")) {
			req.setAttribute("view", "/views/tam-giac.jsp");
		} else if (uri.contains("dang-ky")) {
			req.setAttribute("view", "/views/form.jsp");
		} else if (uri.contains("hit-counter")) {
			req.getRequestDispatcher("/home/increment-hit-counter").forward(req, resp);
            return;
		}

		req.getRequestDispatcher("/views/index.jsp").forward(req, resp);
	}
}
