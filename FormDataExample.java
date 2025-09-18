package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FormDataExample
 */
@WebServlet("/Form")
public class FormDataExample extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//how to read the form data
		String username=request.getParameter("user");
		String password=request.getParameter("pass");
		//set the response type for form data
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//out.println("<h1> Welcome to, "+username+"</h1>");
		//out.println("<h1> Welcome to, "+password+"</h1>");
		if(username.equals("Gowthami")&& password.equals("1234"))
		{
			out.println("<h1> Welcome to, "+username+"</h1>");
			out.println("<h1> Welcome to, "+password+"</h1>");
		}
		else
		{
			out.println("<h1>Invalid</h1>");
		}
	}
}
