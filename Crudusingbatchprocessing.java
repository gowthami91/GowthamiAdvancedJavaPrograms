package com.javapgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Crudusingbatchprocessing {
	public static void main(String[] args) throws SQLException {
		try {
			//step-1:-load and register the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2:-get the connection
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcclass", "root", "Saig@9346");
			
			//create the statement
			
			Statement stmt=con.createStatement();
			
			//execute the query
			
			String sql="insert into Employee values(102,'2004-02-11')";
			stmt.addBatch(sql);
			int[] r=stmt.executeBatch();
			
			String sql1="update Employee set eid=103 where eid=106";
			stmt.addBatch(sql1);
			int[] r1=stmt.executeBatch();
			
			String sql2="delete from Employee where eid=102";
			stmt.addBatch(sql2);
			int[] r2=stmt.executeBatch();
			
			System.out.println("Operation done");
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
