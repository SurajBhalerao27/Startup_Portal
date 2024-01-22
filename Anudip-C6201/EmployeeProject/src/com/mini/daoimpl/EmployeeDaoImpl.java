package com.mini.daoimpl;

import com.mini.dao.EmployeeDao;
import com.mini.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	String[] names = new String[50];
	Employee[] emplist = new Employee[50];
	int index = 0;

	@Override
	public boolean addEmployees(Employee e) {
		if (index < 50) {
			emplist[index] = e;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmployees(Employee e) {
		for (int i = 0; i < index; i++) {
			if (emplist[i] != null && emplist[i].getEmpId() == e.getEmpId()) {
				emplist[i] = e;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteEmployees(int empId) {
		for (int i = 0; i < index; i++) {
			if (emplist[i] != null && emplist[i].getEmpId() == empId) {
				emplist[i] = null;
				return true;
			}
		}
		return false;
	}

	@Override
	public Employee searchEmployeesById(int empId) {
		for (Employee emp : emplist) {
			if (emp != null) {
				int id = emp.getEmpId();
				if (id == empId) {
					return emp;
				}
			}
		}
		return null;
	}

	public Employee searchEmployeesByName(String name) {
		for (Employee emp : emplist) {
			if (emp != null && emp.getEmpName().equalsIgnoreCase(name)) {
				return emp;
			}
		}
		return null;
	}

	@Override
	public Employee[] showAllEmployees() {
		return emplist;
	}
}
