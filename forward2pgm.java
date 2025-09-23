package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class forward2pgm
 */
@WebServlet("/forward2pgm")
public class forward2pgm extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set the response
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				//read the attribute name
				String a=(String) request.getAttribute("user");
				String b=(String) request.getAttribute("pass");
				if(a.equals("Gowthami")&& b.equals("123"))
				{
					out.println("<h1>Welcome to username:"+a+"</h1>");
					out.println("<h1>Welcome to password:"+b+"</h1>");
					out.println("<h1>login successfully</h1>");
				}
				else
				{
					out.println("<h1>login unsuccessful</h1>");
				}
				
	}

}
