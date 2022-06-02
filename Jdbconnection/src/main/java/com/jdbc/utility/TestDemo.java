package com.jdbc.utility;

import java.sql.Connection;

import com.jdbc.quaries.SingletonDesign;

public class TestDemo {

	public static void main(String[] args) {
		
		String s1=PropertyReader.getConnectionInfo("DB_URL");
        //System.out.println(s1);
        Connection c1=SingletonDesign.getConn();
        System.out.println(c1);
	}

}
