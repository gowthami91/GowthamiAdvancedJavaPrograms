package com.javapgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEstablish {
	public static void main(String[] args) throws SQLException {
		//step1:-load and register the driver(mysql)
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.cj.jdbc.Driver
			//step-2:-establish connection between java and mysql
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root","Saig@9346");
			System.out.println("Successfully connected");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
