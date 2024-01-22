package com.arraylist.employee.org;

import java.util.Comparator;

public class EmployeeRoleComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		String er1= o1.role;
		String er2= o2.role;
		return er1.compareTo(er2);
	}
}