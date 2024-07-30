package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Favorite;
import bean.User;
import bean.Video;
import dao.UserDAO;
import dao.VideoDAO;

@WebServlet({ "/find/find-inrange", "/find/find-bymonth","/find/findByUser", "/find/findByTitle"})
public class FilterServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		
		if (uri.contains("findByUser")) {
			this.findByUser(req, resp);
		} else if (uri.contains("findByTitle")) {
			this.findVideoTitle(req, resp);
		} else if (uri.contains("find-inrange")) {
			this.findInRange(req, resp);
		} else if (uri.contains("find-bymonth")) {
			this.findByMonth(req, resp);
		}
	}
	
	private void findVideoTitle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if (methodString.equalsIgnoreCase("post")) {
			try {
				String keyword = req.getParameter("keyword");
				VideoDAO dao = new VideoDAO();
				List<Video> videos = dao.findByTitle(keyword);
				req.setAttribute("videos", videos);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		req.setAttribute("view", "/views/bai3.jsp");
		req.setAttribute("viewBai3", "/views/findByTitle.jsp");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
	
	private void findByUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if (methodString.equalsIgnoreCase("post")) {
			try {
				String username = req.getParameter("username");
				UserDAO dao = new UserDAO();
				User user = dao.findByID(username);
				VideoDAO vddao = new VideoDAO();
				
				List<Video> favorites = vddao.findByUser(username);
				req.setAttribute("user", user);
				req.setAttribute("favorites", favorites);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		req.setAttribute("view", "/views/bai3.jsp");
		req.setAttribute("viewBai3", "/views/findByUser.jsp");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	private void findByMonth(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if (methodString.equalsIgnoreCase("post")) {
			try {
				String[] values = req.getParameterValues("month");
				List<Integer> months = new ArrayList<Integer>();
				for (String month : values) {
					months.add(Integer.valueOf(month));
				}
				VideoDAO dao = new VideoDAO();
				List<Video> list = dao.findByMonth(months);
				req.setAttribute("videos", list);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		req.setAttribute("view", "/views/bai3.jsp");
		req.setAttribute("viewBai3", "/views/findByMonth.jsp");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	private void findInRange(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if (methodString.equalsIgnoreCase("post")) {
			try {
				String from = req.getParameter("from");
				String to = req.getParameter("to");
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
				Date fromDate = simpleDateFormat.parse(from);
				Date toDate = simpleDateFormat.parse(to);
				VideoDAO dao = new VideoDAO();
				List<Video> list = dao.findInRange(fromDate, toDate);
				req.setAttribute("videos", list);
			} catch (Exception e) {
			}
		}

		req.setAttribute("view", "/views/bai3.jsp");
		req.setAttribute("viewBai3", "/views/findInRange.jsp");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
