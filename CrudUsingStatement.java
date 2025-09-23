package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class CrudUsingStatement
 */
@WebServlet("/insert")
public class CrudUsingStatement extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//read or get the form data
		
		String Username=request.getParameter("user");
		String Email=request.getParameter("email");
		String Password=request.getParameter("pass");
		
		//set the response type
		
		response.setContentType("text/html");
		
		//response
		
		PrintWriter out=response.getWriter();
		out.println("<h1>welcome to form name " + Username + " </h1>");
		out.println("<h1>welcome to form email " + Email + " </h1>");
		out.println("<h1>welcome to form password " + Password + " </h1>");
		
		//Establish the connection between java and mysql
		
		//step-1:-load and register the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//step-2:-Establish the connection between java and mysql
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcclass", "root", "Saig@9346");
			
			//step-3:-create the statement
			//PreparedStatement pst=con.prepareStatement("insert into Register values(?,?,?)");
			//PreparedStatement pst=con.prepareStatement("update Register set Username=? where Email=?");
			PreparedStatement pst=con.prepareStatement("delete from Register where Username=?");
			pst.setString(1, Username);//set the value from form data
			//pst.setString(2, Email);
			//pst.setString(3, Password);
			//execute the query
			//pst.setString(1,Username);
			pst.executeUpdate();
			
			out.println("<h1>Successfully inserted form data to the database</h1>");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
