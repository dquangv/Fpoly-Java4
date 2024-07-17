package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Product;
import model.ProductData;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<Product> cart = (List<Product>) session.getAttribute("cart");
		if (cart == null) {
			cart = new ArrayList<>();
			session.setAttribute("cart", cart);
		}

		String action = request.getParameter("action");
		if (action != null && action.equals("add")) {
			int id = Integer.parseInt(request.getParameter("id"));
			Product product = ProductData.getProductById(id);
			if (product != null) {
				cart.add(product);
			}
		}

		request.getRequestDispatcher("/views/cart.jsp").forward(request, response);
	}
}