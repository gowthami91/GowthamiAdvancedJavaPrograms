package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class RequestFirstPgm
 */
@WebServlet("/servlet1")
public class RequestFirstPgm extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the form data
		String username=request.getParameter("user");
		//set the attribute name in the form of key value pair
		request.setAttribute("user", username);
		//forward request to the servlet2
		RequestDispatcher rd=request.getRequestDispatcher("forwardpgm");
		rd.forward(request, response);
	}
}
