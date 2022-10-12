package com.DB_JDBC_MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
	static Connection conn = null;

	public static Connection connect() throws SQLException, ClassNotFoundException {

		// 1. create a connection to the database
		//String url = "jdbc:mysql://localhost:3306/demo";
		String url = "jdbc:sqlite:C:/sqlite/Demo.db";
		String username = "root";
		String password = "password";

		// Class.forName("com.mysql.jdbc.Driver"); // load the driver

		conn = DriverManager.getConnection(url, username, password);

		System.out.println("Connection to SQLite has been established.");

		return conn;
	}

		public static void QureryFromDemoDB() throws SQLException {
		// after creating the connection using conn = connect();
		// 2. create and execute SQL Statement
		String sql = "Select * from employee";
		ResultSet Rs = conn.createStatement().executeQuery(sql);
		while (Rs.next()) {
			System.out.print(Rs.getString("employee_id") + "   " + Rs.getString("first_name")+ "   " + Rs.getString("last_name"));
			System.out.println();
		}

	}

	public static void InsertIntoDemoDB() throws SQLException, ClassNotFoundException {
		Connection conn = connect();
		// create Statement
		String sql = "INSERT INTO EMPLOYEE (FIRST_NAME, LAST_NAME, BIRTH_DATE) VALUES ('Daisy2', 'Duck2', '1990-11-12')";
		conn.createStatement().executeUpdate(sql);

	}

	public static void DeleteFromDemoDB(int id) throws SQLException, ClassNotFoundException {
		Connection conn = connect();
		// create Statement
		String sql = "Delete from EMPLOYEE where employee_id=" + id;
		conn.createStatement().executeUpdate(sql);

	}

	public static void UpdateDemoDB(int id) throws SQLException, ClassNotFoundException {
		Connection conn = connect();
		// create Statement
		String sql = "Update EMPLOYEE SET LAST_NAME='Donald' where employee_id=" + id;
		conn.createStatement().executeUpdate(sql);

	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		conn = connect();
		QureryFromDemoDB();
		// InsertIntoDemoDB();
		// QureryFromDemo();
		// DeleteFromDemo(8);
		// UpdateDemo(26);

		// QureryFromDemoDB();
	}
}
