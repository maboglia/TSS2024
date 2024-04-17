package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Router
 */
@WebServlet({"/login"})
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
    	System.out.println("Login attivo");
    }

    
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().setAttribute("logged", null);
		resp.sendRedirect("home");
	}



	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getParameter("username")!=null	&& req.getParameter("password")!=null) {
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
			if (username.equals("test")&&password.equals("test")) {
				req.getSession().setAttribute("logged", "test");
				resp.sendRedirect("home");
			}
			
		}
		
		
	}

	

	

}
