package com.employeeRegistration.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.employeeRegistration.model.Employee;

public class employeeRegistrationDao {
	
	private final String sql = "insert into employee(userName, age, address, password) values (?, ?, ?, ?)";
	
	public boolean register(Employee employee) throws SQLException {
		boolean b = false;
		ConnectionUtil conn = new ConnectionUtil();
		try {
			Connection connection = conn.getConnection();
			
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			
			prepareStatement.setString(1, employee.getUserName());
			prepareStatement.setInt(2, employee.getAge());
			prepareStatement.setString(3, employee.getAddress());
			prepareStatement.setString(4, employee.getPassword());
			
			b = prepareStatement.executeUpdate() > 0;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}
}
