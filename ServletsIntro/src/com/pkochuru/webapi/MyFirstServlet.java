package com.pkochuru.webapi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet(description="/MyFirstServlet", urlPatterns = "/first")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("doGet called");
		
		response.setContentType("text/html");
		
		PrintWriter result = response.getWriter();
		
		result.println("<h2>Please click here to install Servlet Apache Tomcat</h2>");
		result.println("<a href ='Tomcat.html'> Go here to download </a>");
	}*/
	
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		System.out.println("doGet called");
		
		response.setContentType("text/html");
		
		PrintWriter result = response.getWriter();
		
		result.println("<h2>Please click here to install Servlet Apache Tomcat</h2>");
		result.println("<a href ='Tomcat.html'> Go here to download </a>");
	}*/

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("doPost called");
		response.setContentType("text/html");
		//fetch the request values
		String username = request.getParameter("username");
		String address = request.getParameter("address");
		
		if(username.trim().equals("admin"))
		{
			RequestDispatcher disp = request.getRequestDispatcher("other");
			
			response.getWriter().println("Welcome to your home page!");
			disp.include(request, response);
		}
		else
		{
			response.sendRedirect("index.html");
			//RequestDispatcher disp = request.getRequestDispatcher("index.html");
			response.getWriter().println("Hello. Please login with correct credentials!");
			//disp.include(request, response);
		}
		
		//response.getWriter().println("Welcome, " + username.trim() + " from " +address.trim());
	}

}
