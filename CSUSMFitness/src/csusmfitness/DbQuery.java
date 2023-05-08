package csusmfitness;

//import java.awt.event.ActionListener;
import java.sql.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.awt.event.*;

import javax.swing.*;

class UserInfo {
	public String FirstName;
	public String LastName;
	public String Sex;
	public Date Birthday;
	public String Membership;
	public boolean curStatus;
}
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
	
	public UserInfo viewUserDataQuery(int IDNum) throws Exception {
		String query = "SELECT * FROM userinfo WHERE IDNum = " + IDNum;
		
		//register MySQL thin driver w/ DriverManager service
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		//variables
		final String url = "jdbc:mysql:///370test";
		final String user = "root";
		final String password = "e4jX1X217stU";
		
		UserInfo c = new UserInfo();
				
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
			
			if(rs.next() == false) {
				System.out.println("ID Number doesn't exist/was not input correctly.");
				return null;
			}
			
			System.out.println("id\t|FName\t|LName\t|Sex\t|Birthday      |MemTier |Status");
			
			while(rs.next())
			{
				
						c.FirstName = rs.getString("FName");
						c.LastName = rs.getString("LName");
						c.Sex = rs.getString("Sex");
						c.Birthday = rs.getDate("Birthday");
						c.Membership = rs.getString("MemTier");
						c.curStatus = rs.getBoolean("Status");
						
				
			}
		}
		con.close();
		return c;
	}
	
	public void checkInOutQuery(int IDNum) throws Exception {
		String query = "UPDATE userinfo "
				+ "SET Status = !Status "
				+ "WHERE IDNum = " + IDNum;
		
		String query2 = "SELECT Status FROM userinfo "
				+ "WHERE IDNum = " + IDNum; 
		
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
			
			Statement pStmt2 = con.createStatement();
			ResultSet rs = pStmt2.executeQuery(query2);
			
			while(rs.next())
			{
				if(rs.getBoolean("Status") == false) {
					System.out.println("You have checked out!");
				}
				else {
					System.out.println("You have checked in!");
				}
			}
		}
		con.close();
	}
	public int changeCheckInOut() throws Exception{
		int counter = 0;
		
		String countQuery = "SELECT COUNT(*) "
				+ "FROM userinfo "
				+ "WHERE Status = 1";
		
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
			return -1;
		}
		else {
			Statement countCheck = con.createStatement();
			ResultSet checkValue = countCheck.executeQuery(countQuery);
			checkValue.next();
			counter = checkValue.getInt("Count(*)");
		}
		return counter;
	}
}
	

