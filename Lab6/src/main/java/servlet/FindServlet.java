package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Favorite;
import bean.Report;
import bean.User;
import bean.Video;
import dao.ReportDAO;
import dao.UserDAO;
import dao.VideoDAO;

@WebServlet({ "/find/find-userID", "/find/find-videoTitle", "/find/find-userLikeVideo", "/find/find-favorite",
		"/find/favorite-count" })
public class FindServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		if (uri.contains("find-userID")) {
			this.findUserID(req, resp);
		} else if (uri.contains("find-videoTitle")) {
			this.findVideoTitle(req, resp);
		} else if (uri.contains("find-userLikeVideo")) {
			this.findUserLikeVideo(req, resp);
		} else if (uri.contains("find-favorite")) {
			this.findFavorite(req, resp);
		} else if (uri.contains("favorite-count")) {
			this.favoriteCount(req, resp);
		}
	}

	private void findUserID(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if (methodString.equalsIgnoreCase("post")) {
			try {
				String username = req.getParameter("username");
				UserDAO dao = new UserDAO();
				User user = dao.findByID(username);
				List<Favorite> favorites = user.getFavorites();
				req.setAttribute("user", user);
				req.setAttribute("favorites", favorites);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		req.setAttribute("view", "/views/bai2.jsp");
		req.setAttribute("viewBai2", "/views/find-userID.jsp");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
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
		
		req.setAttribute("view", "/views/bai2.jsp");
		req.setAttribute("viewBai2", "/views/findVideoTitle.jsp");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	private void findUserLikeVideo(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String methodString = req.getMethod();
		if (methodString.equalsIgnoreCase("post")) {
			try {
				String videoId = req.getParameter("videoId");
				UserDAO dao = new UserDAO();
				List<User> users = dao.findUserLikeVideo(videoId);
				req.setAttribute("users", users);
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
		
		req.setAttribute("view", "/views/bai2.jsp");
		req.setAttribute("viewBai2", "/views/findUserLikeVideo.jsp");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	private void findFavorite(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if (methodString.equalsIgnoreCase("post")) {
			try {
				boolean favorite = Boolean.parseBoolean(req.getParameter("favorite"));
				VideoDAO dao = new VideoDAO();
				List<Video> list = dao.findFavorite(favorite);
				req.setAttribute("videos", list);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		req.setAttribute("view", "/views/bai2.jsp");
		req.setAttribute("viewBai2", "/views/findFavorite.jsp");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	private void favoriteCount(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if (methodString.equalsIgnoreCase("get")) {
			try {
				ReportDAO dao = new ReportDAO();
				List<Report> reports = dao.report();
				req.setAttribute("reports", reports);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		req.setAttribute("view", "/views/bai2.jsp");
		req.setAttribute("viewBai2", "/views/favoriteCount.jsp");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
