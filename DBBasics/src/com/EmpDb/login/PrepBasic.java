package com.EmpDb.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepBasic {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			//step2 establish connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","tiger");
			PreparedStatement prpstmnt = conn.prepareStatement("insert into db1.emp values(?,?,?)");
			prpstmnt.setInt(1,00121);
			prpstmnt.setString(2,"Steve");
			prpstmnt.setDouble(3,1021);
			int res = prpstmnt.executeUpdate();
			
			if(res==1)
			{
				System.out.println("done inserting");
			}
			
			else
			{
				System.out.println("Error");
			}
		} 
		
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
