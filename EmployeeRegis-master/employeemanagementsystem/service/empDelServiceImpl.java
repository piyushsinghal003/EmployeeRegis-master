package com.cts.employeemanagementsystem.service;

import com.cts.employeemanagementsystem.dao.Employee_RegistrationDAO;
import com.cts.employeemanagementsystem.dao.Employee_RegistrationDAOImpl;
import com.cts.employeemanagementsystem.dao.empDelDAO;
import com.cts.employeemanagementsystem.dao.empDelDAOImpl;

public class empDelServiceImpl implements empDelService{
	private static empDelServiceImpl emp_del_serviceImpl;	
	private empDelDAO d_dao = empDelDAOImpl.getInstance();

	public static empDelServiceImpl getInstance()
	{
		if(emp_del_serviceImpl==null)
		{
			emp_del_serviceImpl = new empDelServiceImpl();
			return emp_del_serviceImpl;
		}
		else
		{
			return emp_del_serviceImpl;
		}
	}

	public String delete(String condition) {
		// TODO Auto-generated method stub
		return d_dao.delete(condition);
	}
}
