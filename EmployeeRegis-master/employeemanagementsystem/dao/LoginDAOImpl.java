package com.cts.employeemanagementsystem.dao;

import com.cts.employeemanagementsystem.util.DBUtils;
import java.sql.*;

public class LoginDAOImpl implements LoginDAO {
	private static LoginDAOImpl loginDAOImpl;	
	public static LoginDAOImpl getInstance()
	{
		if(loginDAOImpl==null)
		{
			loginDAOImpl = new LoginDAOImpl();
			return loginDAOImpl;
		}
		else
		{
			return loginDAOImpl;
		}
	}
	private LoginDAOImpl()
	{	
		
	}
	
	public int getUserStatus(String id)
	
	{
	String query ="select status from login_table where userid=?";	
	Connection connection=null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet =null;
	connection = DBUtils.getConnection();
	try
	{
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1,id);
		resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
		{
			return resultSet.getInt("status");
		}
	}
	catch(SQLException e)
	{e.printStackTrace();}
	return 0;}
	
	
	public String getUserType(String type)
	{String query ="select usertype from TEJASWA.login_table where userid=?";	
	Connection connection=null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet =null;
	connection = DBUtils.getConnection();
	try
	{
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1,type);
		resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
		{
			return resultSet.getString("usertype");
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return null;
	}


	public boolean authenticate(String userName, String password) {
		
		String query = "select * from login_table where userid=? and password=?";
		Connection connection=null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet =null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,userName);
			preparedStatement.setString(2,password);

			resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				return true;
			}
		}
		catch(SQLException e)
		{e.printStackTrace();}
		return false;
	}
	
	public String authorization(String userName)
	{
		return getUserType(userName);
	}

	
}
