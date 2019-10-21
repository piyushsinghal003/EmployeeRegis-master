package com.cts.employeemanagementsystem.service;
import com.cts.employeemanagementsystem.dao.LoginDAO;

import com.cts.employeemanagementsystem.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {
	
	private static LoginServiceImpl loginServiceImpl;
	private LoginDAO dao = LoginDAOImpl.getInstance();
	public static LoginServiceImpl getInstance()
	{
		if(loginServiceImpl==null)
		{
			loginServiceImpl = new LoginServiceImpl();
			return loginServiceImpl;
		}
		else
		{
			return loginServiceImpl;

		}
	}
public int getUserStatus(String id)
{
	return dao.getUserStatus(id);
}
public String getUserType(String id)
{
	return dao.getUserType(id);
}
public boolean authenticate(String userName,String password){
	return dao.authenticate(userName, password);
}
public String authorization(String userName)
{
	return dao.getUserType(userName);
}
}
