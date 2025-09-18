package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CrudOperationsScanner {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcclass","root", "Saig@9346");
			System.out.println("Successfully Connected");
			Statement stmt=con.createStatement();
			Scanner sc=new Scanner(System.in);
			//System.out.println("Enter tablename");
			//String tname=sc.next();
			//System.out.println("Enter column1 value");
			//int col1=sc.nextInt();
			//System.out.println("Enter datatype for col1");
			//String type1=sc.next();
			//System.out.println("Enter column2 value");
			//String col2=sc.next();
			//System.out.println("Enter age value");
			//String col3=sc.next();
			
			
			//System.out.println("Enter datatype for col2");
			//String type2=sc.next();
			//String sql = "CREATE TABLE " + tname + " (" + col1 + " " + type1 + ", " + col2 + " " + type2 + ")";
			//String sql = "INSERT INTO Student VALUES(" + col1 + ", '" + col2 + "')";
			//String sql="alter table Student add age INT";
			//String sql="alter table Student add marks INT";
			String sql="alter table Student drop marks";
			int res=stmt.executeUpdate(sql);
			System.out.println("successfully done");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
