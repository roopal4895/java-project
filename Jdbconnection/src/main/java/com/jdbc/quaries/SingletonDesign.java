package com.jdbc.quaries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.PropertyResourceBundle;

import com.jdbc.utility.PropertyReader;

public final class SingletonDesign {
	
	static Connection connection=null;//static method
	
	private SingletonDesign()
	{
		
		
	}
	//synchronized use for performing thread step wise
	synchronized public static Connection getConn()
	{
		try
		{
		if (connection==null)
		{
			
			Class.forName(PropertyReader.getConnectionInfo("DB_Driver"));
			connection =DriverManager.getConnection(PropertyReader.getConnectionInfo("DB_URL"),PropertyReader.getConnectionInfo("DB_USER"),PropertyReader.getConnectionInfo("DB_PASS"));	
			return connection;
			}
			
			else
			{
				return connection;	
			}
		    }
			catch (Exception e) {
				e.printStackTrace();
			}
			return connection;
			}
		
		
		
	}


