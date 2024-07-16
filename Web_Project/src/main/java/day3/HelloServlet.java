package day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// This method gets called when a client makes a request to this servlet
		//Generating HTML response
		//Setting the MIME (Multipurpose Internet Mail Extension) type to text/html. 
		String mimeType = "text/html";
		response.setContentType(mimeType);
		//Sending the response using java.io.PrintWriter associated with the response
		PrintWriter out = response.getWriter();
		String responseText = "<h1 style='color:blue'>Hello from Servlet</h1>";
		out.println(responseText);//Actually sending the response.
		
	}

}









