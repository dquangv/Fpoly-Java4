package com.poly.servlet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hitcounterservlet")
public class HitCounterServlet extends HttpServlet{
	int count;
	Path path = Paths.get("C:\\Users\\Quang\\OneDrive - FPT Polytechnic\\Desktop\\fpl\\hk5\\java4\\official\\lab\\fpoly\\count.txt");

	@Override
	public void init() throws ServletException {
		try {
			count = Integer.parseInt(Files.readAllLines(path).get(0));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		count++;
		Files.write(path,String.valueOf(count).getBytes(),StandardOpenOption.WRITE);
		req.setAttribute("count", count);
		req.getRequestDispatcher("/views/hit-counter.jsp").forward(req, resp);
	}

	@Override
	public void destroy() {
		try {
			Files.write(path,String.valueOf(count).getBytes(),StandardOpenOption.WRITE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
