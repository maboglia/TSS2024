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
@WebServlet({"/home", "/index"})
public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Router() {
    	System.out.println("Router attivo");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//monto una pagina divisa in parti
		
		//setto una var titolo
		request.setAttribute("titolo", "Home page del magazzino abbigliamento");
		//includo header
		request.getRequestDispatcher("header.jsp").include(request, response);
		//includo content
		
		if (request.getParameter("page")!=null) {
			String paginaRichiesta = request.getParameter("page");
			switch (paginaRichiesta) {
			case "maglie":
				request.setAttribute("titolo","Home delle maglie");
				request.getRequestDispatcher("maglie.jsp").include(request, response);
				break;
			case "pantaloni":
				request.setAttribute("titolo","Home dei pantaloni");
				request.getRequestDispatcher("pantaloni.jsp").include(request, response);
				break;
			default:
				request.getRequestDispatcher("content.jsp").include(request, response);
				break;
			}
			
		} else {
			request.getRequestDispatcher("content.jsp").include(request, response);
			
		}
		
		//includo footer
		request.getRequestDispatcher("footer.html").include(request, response);
		
		
	}

	

}
