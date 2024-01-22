package com.arraylist.employee.org;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		Double es1= o1.salary;
		Double es2= o2.salary;
		return es1.compareTo(es2);
	}
}