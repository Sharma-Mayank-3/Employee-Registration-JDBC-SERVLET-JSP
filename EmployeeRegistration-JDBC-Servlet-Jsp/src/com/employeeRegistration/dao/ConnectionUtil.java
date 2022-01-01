package com.employeeRegistration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private Connection connection;
	private final String JDBCDriver = "com.mysql.jdbc.Driver";
	private final String JDBCURL = "jdbc:mysql://localhost/december8";
	private final String JDBCUserName = "root";
	private final String JDBCPassword = "root";
	
	public Connection getConnection() throws ClassNotFoundException {
		getClass().forName(JDBCDriver);
		
		try {
			connection = DriverManager.getConnection(JDBCURL, JDBCUserName, JDBCPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
