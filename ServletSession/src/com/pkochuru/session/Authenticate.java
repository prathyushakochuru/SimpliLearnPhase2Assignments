package com.pkochuru.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/authenticate")
public class Authenticate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		
		HttpSession session = request.getSession();
		ServletContext context = getServletContext();
		
		if(username != null)
		{
			session.setAttribute("uName", username);
			context.setAttribute("unameServ", username);
		}
		
		out.println("Welcome " + username + "<br>");
		out.println("Welcome " + session.getAttribute("uName"));
		out.println("Welcome " + context.getAttribute("unameServ"));
	}

}
