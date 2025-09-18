package com.javapgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CrudAssignment {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcclass","root", "Saig@9346");
			System.out.println("Successfully Connected");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			int eid=sc.nextInt();
			System.out.println("Enter date");
			String dob=sc.next();
			Statement stmt=con.createStatement();
			String sql="insert into Employee values("+eid+",'"+dob+"')";
			int res=stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
