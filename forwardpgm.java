package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class forwardpgm
 */
@WebServlet("/forwardpgm")
public class forwardpgm extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set the response
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//read the attribute name
		String a=(String) request.getAttribute("user");
		out.println("<h1>Welcome to username:"+a+"</h1>");
	}
}
