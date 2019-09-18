package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DBConnection class creates a connection and load the mysql driver
 * 
 * @author jyoti
 *
 */
public class DBConnectionDao {
	static Connection con;

	/**
	 * @return the connection reference method to create connection reference
	 */
	public static Connection getDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/EmployeeDetailsdb", "root",
					"Jyoti@123");
			return con;
		} catch (SQLException e) {
			System.out.println("SQLException occured");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException occured");
			e.printStackTrace();
		}

		return null;
	}
}
