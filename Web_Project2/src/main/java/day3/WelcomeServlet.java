package day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet(name = "myWelcomeServlet", urlPatterns = {"/welcome", "/welcomeBack"} )
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Welcome all </h2>");
	}
	@Override
	public void init() {
		System.out.println("Initializing the servlet");				
	}
	@Override
	public void destroy() {
		System.out.println("Destroying the servlet");
	}

}
