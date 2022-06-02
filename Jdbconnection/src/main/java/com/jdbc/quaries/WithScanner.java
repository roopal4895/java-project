package com.jdbc.quaries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class WithScanner {
	
	public static void main( String[] args )
    {
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdb","root","Aashu4895@"); 
            Statement s=connection.createStatement();
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your id");
            String quary ="insert into empl values(2,'shyam','rupali@gmail.com','9856320125','pass123',5632)";
            int i=s.executeUpdate(quary);
            if(i>0)
             System.out.println("values are stored in db");
            else
            	System.out.println("error");
           
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
			
		}
        
    }

}
