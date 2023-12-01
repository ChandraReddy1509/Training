package com.jdbc.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		

			try {

				Class.forName("org.postgresql.Driver");
				System.out.println("Driver Loaded");
				Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
				System.out.println("Connected");
				
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select*from employee");
				System.out.println("records:");
				while(rs.next()) {
					System.out.println("code:"+rs.getByte(1)+"\nName:"+rs.getString(2)+"\nSalary:"+rs.getInt(3));
				}
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (SQLException e)
			{
				e.printStackTrace();

			}
}
}