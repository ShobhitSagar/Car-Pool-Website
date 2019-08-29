package com.util;

import java.sql.*;

public class DBUtil {
	
	private static Connection con=null;
	public static Connection getCon() throws SQLException{
		String uname="root";
		String password="root";
		 String dbname = "carpool";
		String url="jdbc:mysql://localhost:8889/"+dbname;
		String driverClass="com.mysql.jdbc.Driver";
		try{
			Class.forName(driverClass);    
			con=DriverManager.getConnection(url,uname,password);
			System.out.println("connection ok");
		}catch(ClassNotFoundException e){
			System.out.println("driver loading...");
		}
		return con;
	}

}
