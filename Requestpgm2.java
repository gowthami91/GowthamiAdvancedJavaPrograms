package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Requestpgm2
 */
@WebServlet("/servlet")
public class Requestpgm2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the form data
				String username=request.getParameter("user");
				String password=request.getParameter("pass");
				//set the attribute name in the form of key value pair
				request.setAttribute("user", username);
				request.setAttribute("pass", password);
				//forward request to the servlet2
				RequestDispatcher rd=request.getRequestDispatcher("forward2pgm");
				rd.forward(request, response);
	}
}
