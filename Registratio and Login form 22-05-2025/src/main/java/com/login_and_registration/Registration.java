package com.login_and_registration;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/registration")
	//main code started
public class Registration implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String number = req.getParameter("number");
		String gender = req.getParameter("gender");
		String hobbies[] = req.getParameterValues("hobbies");
		String country = req.getParameter("country");
		String Address = req.getParameter("Address");
		String val="";
		for(String str:hobbies)
		{
			val+=str+" ";
		}
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		pw.println("Full name     : "+name+"<br>");
		pw.println("Email         : "+email+"<br>");
		pw.println("Password      : "+password+"<br>");
		pw.println("Mobile number : "+number+"<br>");
		pw.println("Gender        : "+gender+"<br>");
		pw.println("Hobbies       : "+val+"<br>");
		pw.println("Country       : "+country+"<br>");
		pw.println("Address       : "+Address+"<br>");
	
		
	}

}
