package com.poly.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dang-ky")
public class DangKyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/dang-ky/form.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		boolean gender = Boolean.parseBoolean(req.getParameter("gender"));
		String married = req.getParameter("married")!=null ? "on" : "off";
		String country = req.getParameter("country");
		String note = req.getParameter("note");
		
		String[] hobbies = req.getParameterValues("hobbies");
		String hobby = "";
        if (hobbies != null) {
        	hobby = String.join(", ", hobbies);
        	hobby += ".";
        }
		
		System.out.println(">>name: "+name);
		System.out.println(">>password: "+password);
		System.out.println(">>gender: "+gender);
		System.out.println(">>married: "+married);
		System.out.println(">>country: "+country);
		System.out.println(">>note: "+note);
		
		req.setAttribute("name", name);
		req.setAttribute("password", password);
		req.setAttribute("gender", gender);
        req.setAttribute("married", married);
        req.setAttribute("country", country);
        req.setAttribute("note", note);
        req.setAttribute("hobby", hobby);
		
		req.getRequestDispatcher("/views/dang-ky/result.jsp").forward(req, resp);
	}
}