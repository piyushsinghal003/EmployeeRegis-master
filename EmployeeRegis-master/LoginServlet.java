package com.cts.employeemanagementsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.employeemanagementsystem.service.LoginService;
import com.cts.employeemanagementsystem.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userId");
		String password = request.getParameter("password");
		System.out.println(userName+" "+password);
		LoginService loginService = LoginServiceImpl.getInstance();
		if(loginService.authenticate(userName, password))
		{
			int userStatus = loginService.getUserStatus(userName);
			String authorization = loginService.authorization(userName);
			if("A".equals(authorization))
			{
				if(userStatus==0)
				{
				RequestDispatcher rd = request.getRequestDispatcher("admin.html");
				rd.forward(request, response);}
				if(userStatus==1)
				{
					RequestDispatcher rd = request.getRequestDispatcher("ali.html");
					rd.forward(request, response);}
				
				else
				{
					RequestDispatcher rd = request.getRequestDispatcher("deactivated_user.html");
					rd.forward(request, response);}
				}

			
		if("U".equals(authorization))
		{
			if(userStatus==0)
			{
			RequestDispatcher rd = request.getRequestDispatcher("user.html");
			rd.forward(request, response);
			}
			if(userStatus==1)
			{
				RequestDispatcher rd = request.getRequestDispatcher("ali.html");
				rd.forward(request, response);}
			
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("deactivated_user.html");
				rd.forward(request, response);}
			

		}if("V".equals(authorization))
		{
			if(userStatus==0)
			{
			RequestDispatcher rd = request.getRequestDispatcher("vendor.html");
			rd.forward(request, response);}
			if(userStatus==1)
			{
			RequestDispatcher rd = request.getRequestDispatcher("ali.html");
			rd.forward(request, response);}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("deactivated_user.html");
				rd.forward(request, response);}
			}

		}
			
					
		else
		{
			System.out.println("Wrong Password ");
RequestDispatcher rd = request.getRequestDispatcher("login.html");

			
			rd.forward(request, response);
		}
		
		/*if("admin".equals(userName) && "admin".equals(password))
		{
		
			r
		}/*
			RequestDispatcher rd = request.getRequestDispatcher("admin.html");

			
			rd.include(request, response);
			//	response.sendRedirect("admin.html");	}
		//doGet(request, response);*/
		
		
	}
	}

