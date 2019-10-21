package com.cts.employeemanagementsystem.service;

import com.cts.employeemanagementsystem.dao.Employee_RegistrationDAOImpl;

import com.cts.employeemanagementsystem.dao.Employee_RegistrationDAO;

public class employeeServiceImpl implements employeeService{
	private static employeeServiceImpl emp_serviceImpl;	
	private Employee_RegistrationDAO e_dao = Employee_RegistrationDAOImpl.getInstance();

	public static employeeServiceImpl getInstance()
	{
		if(emp_serviceImpl==null)
		{
			emp_serviceImpl = new employeeServiceImpl();
			return emp_serviceImpl;
		}
		else
		{
			return emp_serviceImpl;
		}
	}
	public String insert(String id, String fn, String ln, int sal) {
		return e_dao.insert(id,fn,ln,sal);
	}
	public String update(String tupple, String change) {
		// TODO Auto-generated method stub
		return e_dao.update(tupple, change);
	}
	
	
}
