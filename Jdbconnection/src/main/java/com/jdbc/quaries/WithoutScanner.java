package com.jdbc.quaries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

/**
 * Hello world!
 *
 */
public class WithoutScanner 
{
    public static void main( String[] args )
    {
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");//driver class load dynamicaly, cj is a package name
        	//connection is an interface.drivermanager is a class and getconnection is a method, where we pass connection string in url.We get object of connection here.
        	Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdb","root","Aashu4895@"); //connection established
            //statement is use to run the quary
        	Statement s=connection.createStatement(); //we get statement
            String quary ="insert into empl values(10,'shyam','rupali1@gmail.com','92256320125','pass123',5632)";
            //String quary1 ="alter table empl add otp int(34)";
            int i=s.executeUpdate(quary);
            if(i>0)
             System.out.println("values are stored in db");
            else
            	System.out.println("error");
            //ResultSet is an interface
            ResultSet resultset=s.executeQuery("select * from empl");
            while (resultset.next())
            {
            	System.out.println(resultset.getInt(1));
            	System.out.println(resultset.getString(2));
            	System.out.println(resultset.getString(3));
            	System.out.println(resultset.getString(4));
            	System.out.println(resultset.getInt("pass"));
            }
        }
        catch (Exception e) {
			System.out.println(e);
		}
        
    }
}
