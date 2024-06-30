package poly.com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/views/bai2")
public class Bai2Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("bai2.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double a = Double.parseDouble(req.getParameter("txta"));
		double b = Double.parseDouble(req.getParameter("txtb"));
		double tong = a + b;
		
		req.setAttribute("ketqua", tong);
		req.getRequestDispatcher("bai2.jsp").forward(req, resp);
	}
}
