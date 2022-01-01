package com.employeeRegistration.model;

public class Employee {
	private String userName;
	private int age;
	private String address;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Employee(String userName, int age, String address, String password) {
		super();
		this.userName = userName;
		this.age = age;
		this.address = address;
		this.password = password;
	}
}
