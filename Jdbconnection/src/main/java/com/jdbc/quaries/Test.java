package com.jdbc.quaries;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println(SingletonDesign.getConn());
		try {
			Connection connection=SingletonDesign.getConn();
			//System.out.println(connection);
			Statement statement =connection.createStatement();
			Scanner scanner =new Scanner(System.in);
			
			System.out.println("Enter Id");
			int id=scanner.nextInt();
			
			System.out.println("Enter Name");
			String name=scanner.next();
			
			System.out.println("Enter email");
			String email=scanner.next();
			
			System.out.println("Enter mobile number");
			String mobile=scanner.next();
			
			System.out.println("Enter pass");
			String pass=scanner.next();
			
			System.out.println("Enter otp");
			String otp=scanner.next();
			
			int i=statement.executeUpdate("insert into empl values("+id+",'"+name+"','"+email+"','"+mobile+"','"+pass+"',"+otp+")");//chances of sql injection
			if(i>0)
	             System.out.println("values are stored in db");
	            else
	            	System.out.println("error");
		
		}
		catch (Exception e) {
		e.printStackTrace();	
		}

	}

}
