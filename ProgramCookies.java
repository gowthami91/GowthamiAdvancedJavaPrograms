package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CookiesProgram
 */
@WebServlet("/cookieprogram")
public class ProgramCookies extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the form data
		String username=request.getParameter("user");
		String Password=request.getParameter("pass");
		//set the response type
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//create object of cookies
		Cookie c=new Cookie("username",username);
		Cookie c1=new Cookie("Password",Password);
		//add the expiry date
		c.setMaxAge(60*60);//expiry after 1 hour
		c1.setMaxAge(60*60);
		//add cookies to response header
		response.addCookie(c);
		response.addCookie(c1);
		//pass the cookies info to the servlet2
		out.println("<h1><a href='WelcomeCookiespgms'>view cookies info</h1>");
	}
}
