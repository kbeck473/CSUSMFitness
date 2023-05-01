package csusmfitness;

//import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.awt.event.*;

import javax.swing.*;

public class DbQuery {
	
	public void newUserQuery(String FN, String LN, String S, String BDay, String MemT) throws Exception{
		
		String query = "INSERT INTO userinfo (FName, LName, Sex, Birthday, MemTier, Status)"
				+ " VALUES(" + "'" + FN + "', '" + LN + "', '" + S + "', STR_TO_DATE('" + BDay + "', '%d/%m/%Y'), '" + MemT + "', " + "false)";
		
		
		//register MySQL thin driver w/ DriverManager service
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		//variables
		final String url = "jdbc:mysql:///370test";
		final String user = "root";
		final String password = "e4jX1X217stU";
				
		//establish the connection
		Connection con = DriverManager.getConnection(url, user, password);
				
		//display status message
		if (con == null) {
			System.out.println("JDBC connection is not established");
		}
		else
		{
			//System.out.println("Congratulations, " + " JDBC connection is established successfully.\n");
			PreparedStatement pStmt = con.prepareStatement(query);				
			pStmt.executeUpdate();
			System.out.println("added data to db");
		}
		con.close();
		
	}
	
	public void deleteUserQuery(int IDInput) throws Exception {
		String query = "DELETE FROM userinfo "
				+ "WHERE IDNum = " + IDInput;
		
		//register MySQL thin driver w/ DriverManager service
				Class.forName("com.mysql.cj.jdbc.Driver");
						
				//variables
				final String url = "jdbc:mysql:///370test";
				final String user = "root";
				final String password = "e4jX1X217stU";
						
				//establish the connection
				Connection con = DriverManager.getConnection(url, user, password);
						
				//display status message
				if (con == null) {
					System.out.println("JDBC connection is not established");
				}
				else
				{
					//System.out.println("Congratulations, " + " JDBC connection is established successfully.\n");
					PreparedStatement pStmt = con.prepareStatement(query);				
					pStmt.executeUpdate();
					System.out.println("deleted data from db");
				}
				con.close();
				
	}
	
	public void viewUserDataQuery(int IDNum) throws Exception {
		String query = "SELECT * FROM userinfo WHERE IDNum = " + IDNum;
		
		//register MySQL thin driver w/ DriverManager service
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		//variables
		final String url = "jdbc:mysql:///370test";
		final String user = "root";
		final String password = "e4jX1X217stU";
				
		//establish the connection
		Connection con = DriverManager.getConnection(url, user, password);
				
		//display status message
		if (con == null) {
			System.out.println("JDBC connection is not established");
		}
		else
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			System.out.println("id\t|FName\t|LName\t|Sex\t|Birthday      |MemTier |Status");
			
			while(rs.next())
			{
				System.out.println(rs.getInt("IDNum")  + "\t"
						+ rs.getString("FName") + "\t"
						+ rs.getString("LName") + "\t  "
						+ rs.getString("Sex") + "\t"
						+ rs.getDate("Birthday") + "\t"
						+ rs.getString("MemTier") + "\t"
						+ rs.getBoolean("Status"));
			}
		}
		con.close();
	}
}
	

