package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import model.ProductData;

@WebServlet("/detail")
public class DetailServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idParam = request.getParameter("id");
		int id = Integer.parseInt(idParam);
		Product product = ProductData.getProductById(id);

		if (product != null) {
			request.setAttribute("product", product);
			request.getRequestDispatcher("/views/detail.jsp").forward(request, response);
		} else {
		}
	}
}