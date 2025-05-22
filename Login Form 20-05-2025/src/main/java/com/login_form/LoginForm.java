package com.login_form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/user")
public class LoginForm implements Servlet {

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
		String id = req.getParameter("id");
		String fname = req.getParameter("FName");
		String lname = req.getParameter("LName");
		String email = req.getParameter("email");
		String pnumber = req.getParameter("PNumber");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("User id : "+id+"<br>");
		pw.println("User FName : "+fname+"<br>");
		pw.println("User LName : "+lname+"<br>");
		pw.println("User EmailId : "+email+"<br>");
		pw.println("User PNumber: "+pnumber+"<br>");
		
	}

	
}
