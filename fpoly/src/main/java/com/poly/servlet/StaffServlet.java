package com.poly.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

import com.poly.model.Staff;

@MultipartConfig
@WebServlet("/staff")
public class StaffServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/staff/form.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

		File dir = new File(req.getServletContext().getRealPath("/files"));

		if (!dir.exists()) {
			dir.mkdirs();
		}

		Part photo = req.getPart("photo_file");
		File photoFile = new File(dir, photo.getSubmittedFileName());
		photo.write(photoFile.getAbsolutePath());

		try {
			DateTimeConverter dtc = new DateConverter(new Date());
			dtc.setPattern("MM/dd/yyyy");
			ConvertUtils.register(dtc, Date.class);

			Staff staff = new Staff();

            BeanUtils.populate(staff, req.getParameterMap());
            staff.setPhoto(photoFile.getName());

            String hobbies = "";
            if (staff.getHobbies() != null) {
            	hobbies = String.join(", ", staff.getHobbies());
            }

    		req.setAttribute("bean", staff);
    		req.setAttribute("hobbies", hobbies);

        } catch (Exception e) {
            throw new ServletException(e);
        }

		req.getRequestDispatcher("views/staff/result.jsp").forward(req, resp);
	}
}
