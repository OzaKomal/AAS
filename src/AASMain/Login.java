package AASMain;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")

	public class Login extends HttpServlet {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			String query = "from User where Email=? and Pwd=?";
			Query queryObj = session.createQuery(query);
			queryObj.setString(0, username);
			queryObj.setString(1, password);
			List records = queryObj.list();
			if(records.size()>0)
			{
				//requestDispatcher = request.getRequestDispatcher("/Welcome.jsp");
				response.sendRedirect("Welcome.jsp");
			}
			else
			{
				request.setAttribute("loginstatus", "Username/Password do not match.");
				getServletContext().getRequestDispatcher("Login.jsp").forward(request, response);
			}
		}

		
		
	

}
