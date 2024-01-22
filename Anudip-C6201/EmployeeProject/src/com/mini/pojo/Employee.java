package com.mini.pojo;

public class Employee {

	private int empId;
	private String empName;
	private String designation;
	private double salary;
	private int userID=0;
	private String password="";

	public Employee(int empId, String empName, String designation, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
}
