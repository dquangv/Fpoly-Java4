package servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import bean.User;
import dao.UserDAO;

@WebServlet({ "/user/index", "/user/edit/*", "/user/create", "/user/update", "/user/delete" })
public class UserServlet extends HttpServlet {

	private void findAll(HttpServletRequest request, HttpServletResponse response, int page, int size)
			throws ServletException, IOException {
		UserDAO dao = new UserDAO();
		List<User> list = dao.findPage(page, size);
		long totalUsers = dao.count();
		long totalPages = (totalUsers + size - 1) / size;

		request.setAttribute("items", list);
		request.setAttribute("currentPage", page);
		request.setAttribute("totalPages", totalPages);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");

		UserDAO dao = new UserDAO();
		User user = new User();
		String uri = req.getRequestURI();

		if (uri.contains("edit")) {
			String id = uri.substring(uri.lastIndexOf("/") + 1);
			user = dao.findById(id);
		} else if (uri.contains("create")) {
			try {
				BeanUtils.populate(user, req.getParameterMap());
				User createdUser = dao.create(user);

				if (createdUser != null) {
					req.setAttribute("message", "Thêm mới thành công");
				} else {
					req.setAttribute("message", "Thêm mới thất bại");
				}
			} catch (IllegalAccessException | InvocationTargetException e) {
				req.setAttribute("message", "Thêm mới thất bại");
				e.printStackTrace();
			}
		} else if (uri.contains("update")) {
			try {
				BeanUtils.populate(user, req.getParameterMap());

				dao.update(user);
				req.setAttribute("message", "Cập nhật thành công");
			} catch (IllegalAccessException | InvocationTargetException e) {
				req.setAttribute("message", "Cập nhật thất bại");
				e.printStackTrace();
			}
		} else if (uri.contains("delete")) {
			String id = req.getParameter("id");

			dao.remove(id);
			req.setAttribute("message", "Xoá thành công");
		}

		String pageParam = req.getParameter("page");
		int page = pageParam != null ? Integer.parseInt(pageParam) : 0;
		int size = 3;

		req.setAttribute("form", user);
		findAll(req, resp, page, size);
		req.getRequestDispatcher("/user.jsp").forward(req, resp);
	}
}
