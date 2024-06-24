package com.poly.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = CookieUtils.get("username", req);
		String password = CookieUtils.get("password", req);
		
		req.setAttribute("username", username);
		req.setAttribute("password", password);
		
		req.getRequestDispatcher("/views/dang-nhap/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String remember = req.getParameter("remember");
		
		if (!username.equalsIgnoreCase("poly")) {
			req.setAttribute("message", "Sai tên đăng nhập!");
		} else if (password.length() < 6) {
			req.setAttribute("message", "Sai mật khẩu!");
		} else {
			req.setAttribute("message", "Đăng nhập thành công");
			
			int hours = (remember == null) ? 0 : 30*24;
			CookieUtils.add("username", username, hours, resp);
			CookieUtils.add("password", password, hours, resp);
		}
		
		req.getRequestDispatcher("/views/dang-nhap/login.jsp").forward(req, resp);
	}
}
