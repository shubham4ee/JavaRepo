package day4.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import day4.beans.User;
import day4.beans.UserValidator;

/**
 * Servlet implementation class ValidationServlet
 */
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Fetching the values against 2 request parameters: user_name and user_password
		String uid = request.getParameter("user_name");
		String pwd = request.getParameter("user_password");
		//Populating a User object based upon uid and pwd
		User userObj = new User(uid, pwd);
		//Passing this User object to isValid() method from UserValidator to perform validation
		boolean valid = UserValidator.isValid(userObj);
		String responseText = "<h1 style='color:red'>Invalid username or password</h1>";
		if(valid)
			responseText = "<h1 style='color:green'>Welcome to our website!!</h1>";
		out.println(responseText);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
