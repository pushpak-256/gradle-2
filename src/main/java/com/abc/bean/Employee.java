package com.abc.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//	Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/montran", "root","root");
			
			Statement st = con.createStatement();
			
			ResultSet resultSet =st.executeQuery("select * from Employee");
			
		 while (resultSet.next()) {
			 System.out.println(	resultSet.getInt(1)+"\t"+resultSet.getString(2)
		        +"\t"+resultSet.getString(3)+"\t"+resultSet.getString(4)
				 +"\t"+resultSet.getString(5));
		 }
	
	}
}
