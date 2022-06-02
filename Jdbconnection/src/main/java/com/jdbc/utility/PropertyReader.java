package com.jdbc.utility;

	import java.io.FileInputStream;
	import java.util.Properties;

	public class PropertyReader {
		private static Properties connectionProperties=new Properties();
		static {
			
			try {
				FileInputStream conDetail=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//connectionproperties//jdbcconnection.properties");
				connectionProperties.load(conDetail);
				
			}
			catch(Exception e) {
				
			}
			
		}
		public static String getConnectionInfo(String key) {
			// TODO Auto-generated method stub
			return connectionProperties.getProperty(key);
		}
		
//		public static String getConnectionInfo(String key) {
//			  return connectionProperties.getProperty(key);

			 
		 }
			 

	



