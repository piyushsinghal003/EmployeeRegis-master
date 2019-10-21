package com.cts.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.employeemanagementsystem.util.DBUtils;

public class Employee_RegistrationDAOImpl implements Employee_RegistrationDAO {
	
	private static Employee_RegistrationDAOImpl emp_regisDAOImpl;	
	public static Employee_RegistrationDAOImpl getInstance()
	{
		if(emp_regisDAOImpl==null)
		{
			emp_regisDAOImpl = new Employee_RegistrationDAOImpl();
			return emp_regisDAOImpl;
		}
		else
		{
			return emp_regisDAOImpl;
		}
	}
	private Employee_RegistrationDAOImpl()
	{	
		
	}
	
	
	
	public String insert(String id,String fn, String ln, int sal)
	{
		String query ="INSERT INTO employee VALUES (?,?,?,?)";	
		Connection connection=null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet =null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,id);
			preparedStatement.setString(2,fn);
			preparedStatement.setString(3,ln);
			preparedStatement.setInt(4,sal);

			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{
				return "TUPPLE INSERTED";
			}
		}
		catch(SQLException e)
		{e.printStackTrace();}
		return null;}
	
	public String update(String empid, String change) {
		String query ="UPDATE Employee SET salary=? WHERE empid=?";	
		Connection connection=null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet =null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,change);
			preparedStatement.setString(2,empid);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{
				return "Table Altered";
			}
		}
		catch(SQLException e)
		{e.printStackTrace();}
		
		return null;}
	
	
	}	
	
	


