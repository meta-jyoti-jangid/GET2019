package com.metacube.servlet;

import java.sql.*;

/** This is a component class. This class provides connection from the database i.e MySQL.
 * @author jyoti
 */
public class SQLConnection {
	
	// Reference variables.
	private static Connection connection;
	/** This method returns Connection class object.
	 * @return 
	 */
	public static Connection getConnection(String dbName) {
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, "root", "Jyoti@123");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}