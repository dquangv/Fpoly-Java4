package com.poly.servlet;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet("/send-mail")
public class SendMail extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/send-mail.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Mail mail = new Mail();
//		try {
//			BeanUtils.populate(mail, req.getParameterMap());
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		} catch (InvocationTargetException e) {
//			e.printStackTrace();
//		}
//
//		mail.setSender("quangvdps36680@fpt.edu.vn");

		String toReceiver = req.getParameter("toReceiver");
		String ccReceiver = req.getParameter("ccReceiver");
		String bccReceiver = req.getParameter("bccReceiver");
		String subject = req.getParameter("subject");
		String body = req.getParameter("body");

		Properties p = new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.ssl.protocols", "TLSv1.2");
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", 587);
        p.put("mail.debug", "true");

		Session session = Session.getInstance(p, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				String username = "quangvdps36680@fpt.edu.vn";
				String password = "ojtvgwvpjdwpraib";

				return new PasswordAuthentication(username, password);
			}
		});


		MimeMessage message = new MimeMessage(session);

		try {
			message.setFrom(new InternetAddress("quangvdps36680@fpt.edu.vn"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toReceiver));
			message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccReceiver));
			message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bccReceiver));
			message.setSubject(subject, "utf-8");
//			message.setText(body, "utf-8");
//			message.setReplyTo(message.getFrom());

			File dir = new File(req.getServletContext().getRealPath("/files"));

			if (!dir.exists()) {
				dir.mkdirs();
			}

			Part doc = req.getPart("file");
			File docFile = new File(dir, doc.getSubmittedFileName());
			Files.copy(doc.getInputStream(), docFile.toPath());

			MimeBodyPart part = new MimeBodyPart();
			part.setDataHandler(new DataHandler(new FileDataSource(docFile)));
			part.setFileName(docFile.getName());

//			Multipart multipart = new MimeMultipart();
//			multipart.addBodyPart(part);
//			message.setContent(multipart);

			MimeMultipart mimeMultipart = new MimeMultipart();
			MimeBodyPart mimeBodyPart = new MimeBodyPart();
			mimeBodyPart.setContent(body,"text/html; charset=utf-8");
			mimeMultipart.addBodyPart(mimeBodyPart);
			mimeMultipart.addBodyPart(part);

			message.setContent(mimeMultipart);

			Transport.send(message);

			req.setAttribute("message", "Gửi mail thành công!");
		} catch (AddressException e) {
			e.printStackTrace();
			req.setAttribute("message", "Invalid email address: " + e.getMessage());
		} catch (MessagingException e) {
			e.printStackTrace();
			req.setAttribute("message", "Error sending email: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("message", "Error processing file: " + e.getMessage());
		}

		req.getRequestDispatcher("/views/send-mail.jsp").forward(req, resp);
	}
}