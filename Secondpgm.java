package com.servletpgm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Secondpgm
 */
@WebServlet("/Secondpgm")
public class Secondpgm extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set the response type
		
		response.setContentType("text/html");
		
		//set the response to the client
		
		PrintWriter out=response.getWriter();
		
		out.println("<h1>Welcome to first Servlet program</h1>");
	}
}
