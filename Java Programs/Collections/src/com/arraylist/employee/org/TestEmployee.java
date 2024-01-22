package com.arraylist.employee.org;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		
		e1.id = 1;
		e1.name = "Omkar";
		e1.salary = 100000;
		e1.role="Manager";

		e2.id = 2;
		e2.name = "Pushpak";
		e2.salary = 75000;
		e2.role="Manager";
		
		e3.id = 3;
		e3.name = "Mihir";
		e3.salary = 63000;
		e3.role="Manager";
		
		e4.id = 4;
		e4.name = "Neha";
		e4.salary = 50000;
		e4.role="Tester";
		
		e5.id = 3;
		e5.name = "Nita";
		e5.salary = 45000;
		e5.role="Tester";

		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);

		EmployeeMethod em = new EmployeeMethod();
		//p.display(employee);
		System.out.println("--------------------------------------------------------------");
		System.out.println("1. Employee Salary incremented by 40%");
		System.out.println("--------------------------------------------------------------");
		ArrayList<Employee> e = em.IncrementSalary(employee, 40);
		em.display(e);
		System.out.println("--------------------------------------------------------------");
		System.out.println("2. Employee Sorted by Salary using comparator");
		System.out.println("--------------------------------------------------------------");
		/*
		 * ArrayList<Employee> xy = new ArrayList<Employee>(); 
		 * xy.addAll(employee);
		 */
        Collections.sort(e, new EmployeeSalaryComparator());
        e.forEach(s->System.out.println(s));
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("3.List of Employee having role Manager are:");
        System.out.println("--------------------------------------------------------------");
        
		
//		 ArrayList<Employee> managers = em.filterByRole(employee, "Manager");
//		 em.display(managers);
        
        for(int i=0;i<employee.size();i++) {
        	if(employee.get(i).role.equals("Manager")) {
        		System.out.println(employee.get(i));
        	}
        }
        System.out.println("--------------------------------------------------------------");
	}
}
