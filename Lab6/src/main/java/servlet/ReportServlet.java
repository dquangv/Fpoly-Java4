package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Report;
import bean.Video;
import dao.ReportDAO;
import dao.VideoDAO;

@WebServlet({"/find/random10","/find/favoriteByYear"})
public class ReportServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		if (uri.contains("random10")) {
			this.random10(req, resp);
		} else if (uri.contains("favoriteByYear")) {
			this.findFavoriteByYear(req, resp);
		}
	}

	private void findFavoriteByYear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if (methodString.equalsIgnoreCase("post")) {
			try {
				Integer year = Integer.parseInt(req.getParameter("year"));
				ReportDAO dao = new ReportDAO();
				List<Report> list = dao.favoriteByYear(year);
				req.setAttribute("reports", list);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		req.setAttribute("view", "/views/bai4.jsp");
		req.setAttribute("viewBai4", "/views/favoriteByYear.jsp");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	private void random10(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodString = req.getMethod();
		if (methodString.equalsIgnoreCase("get")) {
			try {
				VideoDAO dao = new VideoDAO();
				List<Video> list = dao.random10();
				req.setAttribute("videos", list);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		req.setAttribute("view", "/views/bai4.jsp");
		req.setAttribute("viewBai4", "/views/random10.jsp");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
