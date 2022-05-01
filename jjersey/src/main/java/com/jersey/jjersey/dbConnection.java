package com.jersey.jjersey;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.Path;


public class dbConnection 
{
	private static String dbhost = "jdbc:mysql://localhost:3306/javad1";
	private static String username = "root";
	private static String password = "@54321";
	private static Connection conn;
	@SuppressWarnings("finally")
	public static Connection createNewDBconnection() {
		try  {	
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					dbhost, username, password);
			System.out.println("entered database connection");
			System.out.println(conn); 
            PreparedStatement ps=conn.prepareStatement(  
                         "select * from userdetails");  
            ResultSet rs=ps.executeQuery();
             
            rs.next();
            rs.next();
             System.out.println(rs.getInt(1));
             System.out.println(rs.getString(2));
                      
            conn.close();  
		} catch (SQLException e) {
			System.out.println("Cannot create database connection");
			e.printStackTrace();
		} finally {
			return conn;	
		}		
	}
}
