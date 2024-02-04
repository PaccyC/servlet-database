package com.servlet.register;

import java.io.IOException;

import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	public RegisterServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
	response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}
	
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException {
		String name= request.getParameter("name");
		String mobile= request.getParameter("mobile");
		String city= request.getParameter("city");
		String dob= request.getParameter("dob");
		Member member= new Member(name,mobile,city,dob);
		
		DbConnection rdao= new DbConnection();
		String result=rdao.insert(member);
		response.getWriter().print(result);;
	}
}


