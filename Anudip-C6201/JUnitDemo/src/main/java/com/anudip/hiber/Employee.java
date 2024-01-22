package com.anudip.hiber;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private float salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	// why I need to override these methods
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean status = false;
		Employee emp = (Employee) obj; // what this line is doing ??
		if (this.name.equalsIgnoreCase(emp.name) && this.id == emp.id && this.salary == emp.salary) {
			status = true;
		}
		return status;
	}

	public static List<Employee> getEmployeeLsit() {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee(1, "Rohit", 5000.0F);
		Employee emp2 = new Employee(2, "Surya", 6000.0F);
		Employee emp3 = new Employee(3, "Virat", 10000.0F);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		return list;
	}
}
