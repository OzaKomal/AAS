package AASMain;

import java.io.IOException;

import javax.mail.*;
//import javax.activation.*;
import javax.mail.internet.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Forgotservlet
 */
@WebServlet("/Forgotservlet")
public class Forgotservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Forgotservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
	
	   String result;
	   // Recipient's email ID needs to be mentioned.
	   String to = "riashah480@gmail.com";

	   // Sender's email ID needs to be mentioned
	   String from = "kmoza17@gmail.com";

	   // Assuming you are sending email from localhost
	   String host = "localhost";

	   // Get system properties object
	   Properties properties = System.getProperties();

	   // Setup mail server
	   properties.setProperty("mail.smtp.host", host);

	   // Get the default Session object.
	   Session mailSession = Session.getDefaultInstance(properties);

	   try{
	      // Create a default MimeMessage object.
	      MimeMessage message = new MimeMessage(mailSession);
	      // Set From: header field of the header.
	      message.setFrom(new InternetAddress(from));
	      // Set To: header field of the header.
	      message.addRecipient(Message.RecipientType.TO,
	                               new InternetAddress(to));
	      // Set Subject: header field
	      message.setSubject("Reset Password");
	      // Now set the actual message
	      message.setText("change password");
	      // Send message
	      
	      response.sendRedirect("reset.jsp");
	       Transport.send(message);
	      result = "request for new password id made successfully....";
	   }
	   catch (MessagingException mex)
	   {
	      mex.printStackTrace();
	      result = "Error: unable to send message....";
	   }
	}
}
