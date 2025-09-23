package org;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ServletMiniProjectLoginForm
 */
@WebServlet("/login")
public class ServletMiniProjectLoginForm extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if (user.equals("gowthami") && pass.equals("1234")) {
            // Forward to welcome.html (or servlet/JSP)
            RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
            rd.forward(request, response);
        } else {
            // Include error.html if invalid
            RequestDispatcher rd = request.getRequestDispatcher("error.html");
            rd.include(request, response);
        }
	}
}
