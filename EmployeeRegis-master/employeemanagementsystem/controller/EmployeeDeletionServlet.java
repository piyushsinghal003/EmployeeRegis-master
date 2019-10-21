package com.cts.employeemanagementsystem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.employeemanagementsystem.service.empDelService;
import com.cts.employeemanagementsystem.service.empDelServiceImpl;
import com.cts.employeemanagementsystem.service.employeeService;
import com.cts.employeemanagementsystem.service.employeeServiceImpl;

/**
 * Servlet implementation class EmployeeDeletionServlet
 */
public class EmployeeDeletionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDeletionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String empId = request.getParameter("empid");
		

		System.out.println("Employee ID: "+ empId);
		
		
		empDelService empDeleteService = empDelServiceImpl.getInstance();
		empDeleteService.delete(empId);
	}

}
