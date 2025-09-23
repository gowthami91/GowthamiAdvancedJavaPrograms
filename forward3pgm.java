package org;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class forward3pgm
 */
@WebServlet("/forward3pgm")
public class forward3pgm extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set the response
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//read the attribute name
		String a=(String) request.getAttribute("user");
		String b=(String) request.getAttribute("pass");
		out.println("<h1>Welcome to username:"+a+"</h1>");
		out.println("<h1>Welcome to password:"+b+"</h1>");
	}
}
