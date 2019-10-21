package com.cts.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.employeemanagementsystem.util.DBUtils;

public class empDelDAOImpl implements empDelDAO{
	private static empDelDAOImpl emp_delDAOImpl;	
	public static empDelDAOImpl getInstance()
	{
		if(emp_delDAOImpl==null)
		{
			emp_delDAOImpl = new empDelDAOImpl();
			return emp_delDAOImpl;
		}
		else
		{
			return emp_delDAOImpl;
		}
	}
	private empDelDAOImpl()
	{	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String delete(String condition) {
		String query ="DELETE FROM employee WHERE empid=?";	
		Connection connection=null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet =null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,condition);
			
			resultSet = preparedStatement.executeQuery();
			
			
				return "Table Altered";
			
		}
		catch(SQLException e)
		{e.printStackTrace();}
		
		return null;}
}
