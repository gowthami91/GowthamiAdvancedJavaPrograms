package org;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class RequestProgram3
 */
@WebServlet("/first")
public class RequestProgram3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the form data
		String username=request.getParameter("user");
		String password=request.getParameter("pass");
		//set the attribute name in the form of key value pair
		request.setAttribute("user", username);
		request.setAttribute("pass", password);
		//forward request to the servlet2
		RequestDispatcher rd=request.getRequestDispatcher("forward3pgm");
		rd.include(request, response);
	}

}
