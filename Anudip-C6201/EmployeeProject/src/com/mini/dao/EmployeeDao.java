package com.mini.dao;

import com.mini.pojo.Employee;

public interface EmployeeDao {
	public boolean addEmployees(Employee e);

	public boolean updateEmployees(Employee e);

	public boolean deleteEmployees(int empId);

	public Employee searchEmployeesById(int empId);

	public Employee searchEmployeesByName(String name);

	public Employee[] showAllEmployees();
}
