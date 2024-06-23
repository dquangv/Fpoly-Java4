package com.poly.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chunhat.php")
public class ChuNhatServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/chunhat/form-chu-nhat.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double chieudai = Double.parseDouble(req.getParameter("chieudai"));
		double chieurong = Double.parseDouble(req.getParameter("chieurong"));
		double chuvi = (chieudai + chieurong) * 2;
		double dientich = chieudai * chieurong;
		
		req.setAttribute("chuvi", chuvi);
		req.setAttribute("dientich", dientich);
		
		req.getRequestDispatcher("/views/chunhat/ket-qua.jsp").forward(req, resp);
	}
}