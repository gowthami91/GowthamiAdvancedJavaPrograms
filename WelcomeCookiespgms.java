package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class WelcomeCookiespgms
 */
@WebServlet("/WelcomeCookiespgms")
public class WelcomeCookiespgms extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//retrieve the cookies information 
		Cookie[] cookie=request.getCookies();
		for (Cookie cookie2 : cookie) {
			//check
			if(cookie2.getName().equals("username"))//check cookies name and key from the servlet1
			{
				String username=cookie2.getValue();//cookie2.getName().equals("username")&&
				//String Password=cookie2.getValue();
				out.println("<h1>welcome to username "+username+"</h1>");
			}
			if(cookie2.getName().equals("Password"))//check cookies name and key from the servlet1
			{
				//String username=cookie2.getValue();//cookie2.getName().equals("username")&&
				String Password=cookie2.getValue();
				out.println("<h1>welcome to password "+Password+"</h1>");
			}
		}
	}
}
