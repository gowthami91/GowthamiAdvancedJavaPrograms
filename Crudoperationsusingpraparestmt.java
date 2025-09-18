package com.javapgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crudoperationsusingpraparestmt {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcclass", "root", "Saig@9346");
			//PreparedStatement pst=con.prepareStatement("insert into Employee values(?,?)");
			//PreparedStatement pst=con.prepareStatement("Update Employee set eid=? where eid=?");
			//PreparedStatement pst=con.prepareStatement("delete from Employee where eid=?");
			PreparedStatement pst=con.prepareStatement("select * from Employee");
			//pst.setInt(1, 107);
			//pst.setInt(2, 123);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				 int eid = rs.getInt("eid");
				System.out.println(rs.getInt("eid"));
			}
			System.out.println("inserted");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
