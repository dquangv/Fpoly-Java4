package com.poly.lab6.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poly.lab6.bean.Favorite;
import com.poly.lab6.bean.Report;
import com.poly.lab6.bean.User2;
import com.poly.lab6.bean.Video;
import com.poly.lab6.dao.ReportDAO;
import com.poly.lab6.dao.UserDAO;
import com.poly.lab6.dao.VideoDAO;

@WebServlet({ "/find/find-userID", "/find/find-videoTitle", "/find/find-userLikeVideo", "/find/find-favorite", "/find/favorite-count" })
public class FindServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		if(uri.contains("find-userID")) {
			this.findUserID(req, resp);
		}else if(uri.contains("find-videoTitle")) {
			this.findVideoTitle(req, resp);
		}else if(uri.contains("find-userLikeVideo")) {
			this.findUserLikeVideo(req, resp);
		}else if(uri.contains("find-favorite")) {
			this.findFavorite(req, resp);
		}else if(uri.contains("favorite-count")) {
			this.favoriteCount(req, resp);
		}
	}
	
	private void findUserID(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if(methodString.equalsIgnoreCase("post")) {
			try {
				String username = req.getParameter("username");
				UserDAO dao = new UserDAO();
				User2 user = dao.findByID(username);
				List<Favorite> favorites = user.getFavorites();
				req.setAttribute("user", user);
				req.setAttribute("favorites", favorites);
			} catch (Exception e) {
				System.out.println(e);
			}
		}	
		req.getRequestDispatcher("/views/lab6/find-userID.jsp").forward(req, resp);
	}
	
	private void findVideoTitle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if(methodString.equalsIgnoreCase("post")) {
			try {
				String keyword = req.getParameter("keyword");
				VideoDAO dao = new VideoDAO();
				List<Video> videos = dao.findByTitle(keyword);
				req.setAttribute("videos", videos);
			} catch (Exception e) {
				System.out.println(e);
			}
		}	
		req.getRequestDispatcher("/views/lab6/findVideoTitle.jsp").forward(req, resp);
	}
	
	private void findUserLikeVideo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if(methodString.equalsIgnoreCase("post")) {
			try {
				String videoId = req.getParameter("videoId");
				UserDAO dao = new UserDAO();
				List<User2> users = dao.findUserLikeVideo(videoId);
				req.setAttribute("users", users);
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
		req.getRequestDispatcher("/views/lab6/findUserLikeVideo.jsp").forward(req, resp);
	}
	
	private void findFavorite(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if(methodString.equalsIgnoreCase("post")) {
			try {
				boolean favorite = Boolean.parseBoolean(req.getParameter("favorite"));
				VideoDAO dao = new VideoDAO();
				List<Video> list = dao.findFavorite(favorite);
				req.setAttribute("videos", list);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		req.getRequestDispatcher("/views/lab6/findFavorite.jsp").forward(req, resp);
	}
	
	private void favoriteCount(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if(methodString.equalsIgnoreCase("get")) {
			try {
				ReportDAO dao = new ReportDAO();
				List<Report> reports = dao.report();
				req.setAttribute("reports", reports);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		req.getRequestDispatcher("/views/lab6/favoriteCount.jsp").forward(req, resp);
	}
}
