package com.employeeRegistration.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeRegistration.dao.employeeRegistrationDao;
import com.employeeRegistration.model.Employee;

/**
 * Servlet implementation class EmployeeRegistrationServlet
 */
@WebServlet("/registration")
public class EmployeeRegistrationServlet extends HttpServlet {
	
	private employeeRegistrationDao employeeRegistrationDao;
	
	public void init() {
		employeeRegistrationDao = new employeeRegistrationDao();
	}
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String useeAge = request.getParameter("age");
		int age = Integer.parseInt(useeAge);
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		
		Employee emp = new Employee(userName, age, address, password);
		try {
			if(employeeRegistrationDao.register(emp)) {
				request.getRequestDispatcher("view/employee-success.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("view/employee-fail.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
