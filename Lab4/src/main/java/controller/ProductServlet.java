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


@WebServlet("/product")
public class ProductServlet extends HttpServlet{
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Product> products = ProductData.getProducts();

        HttpSession session = req.getSession();
        session.setAttribute("products", products);

        req.setAttribute("products", products);
        req.getRequestDispatcher("/views/layout.jsp").forward(req, resp);
    }
}
