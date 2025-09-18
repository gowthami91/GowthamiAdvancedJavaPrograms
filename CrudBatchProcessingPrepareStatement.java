package com.javapgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudBatchProcessingPrepareStatement {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcclass", "root", "Saig@9346");
			 PreparedStatement pst = con.prepareStatement("insert into Employee values (?, ?)");
	            pst.setInt(1, 301);
	            pst.setString(2, "2002-04-02");
	            pst.addBatch();
	            int[] r=pst.executeBatch();
	            
	            System.out.println("Record inserted!");
	            
	            PreparedStatement pst1 = con.prepareStatement("update Employee set eid=? where dob=?");
	            pst1.setInt(1, 102);
	            pst1.setString(2, "2000-01-08");

	            pst1.addBatch();
	            int[] r1=pst1.executeBatch();
	            
	            System.out.println("Record updated!");
	            PreparedStatement pst2 = con.prepareStatement("delete from Employee where dob=?");
	            pst2.setString(1, "  1998-03-28"); 
	            pst2.addBatch();
	            int[] r2=pst2.executeBatch();
	            System.out.println("Record deleted!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
