package com.arraylist.employee.org;

public class Employee {
	
	int id;
	String name;
	double salary;
	String role;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, double salary, String role) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.role = role;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		
		return role;
	}
	public void setRole(String role) {
		
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee id:" + id + ", Name:" + name + ", Salary:" + salary + ", Role:" + role ;
	}	
}
