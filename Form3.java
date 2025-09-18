package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Form3
 */
@WebServlet("/example1")
public class Form3 extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String[] skills=request.getParameterValues("check");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
			for(String s:skills)
			{
				out.println("<h1>"+s+"</h1>");
			}
	}
}
