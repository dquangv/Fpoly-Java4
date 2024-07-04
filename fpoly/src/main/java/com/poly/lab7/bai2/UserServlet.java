package com.poly.lab7.bai2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet({ "/admin/index", "/admin/edit/*", "/admin/create", "/admin/update", "/admin/delete/*", "/admin/delete/" })
public class UserServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDAO dao = new UserDAO();
		User3 user = new User3();
		String uriString = req.getRequestURI();
		if (uriString.contains("edit")) {
			String idString = uriString.substring(uriString.lastIndexOf("/") + 1);
			user = dao.findById(idString);
		} else if (uriString.contains("create")) {
			try {
				BeanUtils.populate(user, req.getParameterMap());
				dao.create(user);
				req.setAttribute("message", "Successfully");
			} catch (Exception e) {
				req.setAttribute("message", "Failed");
			}
		} else if (uriString.contains("update")) {
			try {
				BeanUtils.populate(user, req.getParameterMap());
				dao.update(user);
				req.setAttribute("message", "Successfully");
			} catch (Exception e) {
				req.setAttribute("message", "Failed");
			}
		} else if (uriString.contains("delete")) {
			try {
				// String id = uriString.substring(uriString.lastIndexOf("/") + 1);
				String id = req.getParameter("id");
				dao.remove(id);
				req.setAttribute("message", "Successfully");
			} catch (Exception e) {
				req.setAttribute("message", "Failed");
			}
		}
		req.setAttribute("form", user);
		req.setAttribute("items", dao.findAll());
		req.getRequestDispatcher("/views/user.jsp").forward(req, res);
	}

}
