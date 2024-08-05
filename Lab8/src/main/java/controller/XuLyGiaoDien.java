package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.coyote.http11.filters.VoidInputFilter;

import dao.UserDAO;
import entity.User;

@WebServlet({"","/home/index","/home/about","/home/contact","/home/nut"})
//@WebServlet({"","/index","/about","/contact","/nut"})
public class XuLyGiaoDien extends HttpServlet 
{


@Override
protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
{
	String uri=req.getRequestURI();
	//if(uri.contains("index") || uri.contains(""))
		if(uri.contains("index") )
			{
				req.setAttribute("view", "/views/home/trangchu.jsp");
				//req.getRequestDispatcher("/index.jsp").forward(req, resp);
				
			}
		else if(uri.contains("about"))
		{	
		// xử lý đô dữ liệu ở đây.
	
		req.setAttribute("view","/views/home/about.jsp");
		//req.getRequestDispatcher("/index.jsp").forward(req, resp);
	
		}
		else if(uri.contains("contact"))
			
		{	req.setAttribute("view", "/views/home/contact.jsp");
		//req.getRequestDispatcher("/index.jsp").forward(req, resp);
		
			
		}
		else if(uri.contains("nut"))//load database
		{	
			findAll(req, resp);
			req.setAttribute("view", "/views/home/user1.jsp");
		
		}
	// dong nay phai de duoi de sta view truoc
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
}
		protected void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			// TODO Auto-generated method stub
			try {
				UserDAO dao = new UserDAO();
				List<User> list = dao.findAll();
				request.setAttribute("users", list);
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				request.setAttribute("error", "Error: "+e.getMessage());
			}
		}
		
		}
