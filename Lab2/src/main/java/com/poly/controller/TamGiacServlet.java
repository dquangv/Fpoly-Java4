package com.poly.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/tam-giac", "/dien-tich","/chu-vi"})
public class TamGiacServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException {
		req.getRequestDispatcher("/views/tam-giac.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double a = Double.parseDouble(req.getParameter("a"));
		double b = Double.parseDouble(req.getParameter("b"));
		double c = Double.parseDouble(req.getParameter("c"));
		double p, s;
		String uri = req.getRequestURI();
		
		if ((a+b>c) && (b+c)>a && (c+a)>b) {
			p = a + b + c;
			s = Math.sqrt((p/2)*(p/2-a)*(p/2-b)*(p/2-c));
			
			if (uri.contains("dien-tich")) {
				req.setAttribute("message", "Diện tích của tam giác là " + s);
			} else {
				req.setAttribute("message", "Chu vi của tam giác là " + p);
			}
			
		} else {
			req.setAttribute("message", "Số đo các cạnh không tạo thành một tam giác");
		}
		
		req.getRequestDispatcher("/views/tam-giac.jsp").forward(req, resp);
	}
}