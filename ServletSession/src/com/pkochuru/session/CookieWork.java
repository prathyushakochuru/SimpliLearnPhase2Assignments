package com.pkochuru.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieWork
 */
@WebServlet("/Cookies")
public class CookieWork extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	
	Cookie theCookie = new Cookie("CompanyName", "Indelligence");
	
	theCookie.setMaxAge(3000);
	
	response.addCookie(theCookie);
	
	response.getWriter().println(theCookie.getValue() + "<br>");
	response.getWriter().println(theCookie.getName());
	}

	

}
