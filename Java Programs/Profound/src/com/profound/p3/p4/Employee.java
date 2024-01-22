package com.profound.p3.p4;

public class Employee {
	int id, salary;
	String name;

	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id= " + id + ", salary= " + salary + ", name= " + name + "]";
	}
}
