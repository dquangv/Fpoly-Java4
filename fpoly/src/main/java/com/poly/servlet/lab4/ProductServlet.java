package com.poly.servlet.lab4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poly.model.Product;

@WebServlet("/product")
public class ProductServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Product pro6 = new Product("Quang 1", "files/1.jpg", 100);
		Product pro1 = new Product("Quang 2", "files/2.jpg", 200);
		Product pro2 = new Product("Quang 3", "files/3.jpg", 300);
		Product pro3 = new Product("Quang 4", "files/4.jpg", 400);
		Product pro4 = new Product("Quang 5", "files/5.jpg", 500);
		Product pro5 = new Product("Quang 6", "files/6.jpg", 600);

		List<Product> pros = new ArrayList();
		pros.add(pro1);
		pros.add(pro2);
		pros.add(pro3);
		pros.add(pro4);
		pros.add(pro5);
		pros.add(pro6);

		req.setAttribute("products", pros);

		req.getRequestDispatcher("/views/lab4/layout.jsp").forward(req, resp);
	}
}
