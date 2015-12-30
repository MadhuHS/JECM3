package com.EmpDb.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBlogin 
{
	private static String insertquery = "insert into db1.emp values(07,'Alex',1542.5)";
	
	public static void main(String[] args) 
	{
		try 
		{
			//step1 load and register the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//step2 establish connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","tiger");
			
			//step3 create a platform or statement
			Statement statement = conn.createStatement();
		    int rscode =statement.executeUpdate(insertquery);
			
			if(rscode==1)
			{
				System.out.println("done inserting");
			}
			
			else
			{
				System.out.println("Error");
			}
			
			
		   ResultSet res = statement.executeQuery("select * from db1.emp");
		   
		   while (res.next()) 
		   {
			   int id =  res.getInt(1);
			   String name = res.getString(2);
			   double sal  = res.getDouble(3);
			   
			   System.out.println("Id "+id + "NAme "+name+" Sal "+sal);
			
		}
		} 
		
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
