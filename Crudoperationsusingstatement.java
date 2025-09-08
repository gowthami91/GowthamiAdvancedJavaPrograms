package com.javapgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Crudoperationsusingstatement 
{
	public static void main(String[] args) throws SQLException 
	{
		
		try 
		{
			//step-1:-load and register the drivers
			
			Class.forName("com.mysql.jdbc.Driver");

			//step-2:-establish connection between java and mysql

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcclass", "root", "Saig@9346");
			
			System.out.println("Connected Successfully");
			
			//step-3:-create the statement (writing the queries)
			
			Statement stmt=con.createStatement();
			
			//String sql="create database jdbcclass";
			
			//String sql="create table Employee(id int,dob date)";
			//String sql="alter table Employee add age int";
			//String sql="alter table Employee rename column id to eid";
			//String sql="alter table Employee drop age";
			//String sql="alter table Employee modify eid varchar(10)";
			//String sql="insert into Employee values('10','1998-03-28'),('20','2006-08-27')";
			//String sql="update Employee set eid='1000'";
			String sql="delete from Employee where dob='2006-08-27'";
			int res=stmt.executeUpdate(sql);//ddl and dml commands
			
			System.out.println("executed");
		} 
		catch (ClassNotFoundException e) 
		{

			e.printStackTrace();
		}
	}
}
