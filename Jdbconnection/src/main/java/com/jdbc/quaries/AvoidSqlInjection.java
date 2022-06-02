package com.jdbc.quaries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
public class AvoidSqlInjection {
	
	public static void main(String[] args) {
			System.out.println(SingletonDesign.getConn());
			try {
				Connection connection=SingletonDesign.getConn();
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
				
				//int i=statement.executeUpdate("insert into empl values("+id+",'"+name+"','"+email+"','"+mobile+"','"+pass+"',"+otp+")");//chances of sql injection
				PreparedStatement stmt = connection.prepareStatement("insert into empl values(?,?,?,?,?,?)");
//				stmt.setInt(1,5);
//				stmt.setString(2,"riya");
//				stmt.setString(3, "riya@gmail.com");
//				stmt.setString(4, "9865320125");
//				stmt.setString(5, "as123");
//				stmt.setInt(6,6589);
				
				stmt.setInt(1,id);
				stmt.setString(2,name);
				stmt.setString(3, email);
				stmt.setString(4, mobile);
				stmt.setString(5, pass);
				stmt.setString(6,otp);
				
				int i=stmt.executeUpdate();
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



