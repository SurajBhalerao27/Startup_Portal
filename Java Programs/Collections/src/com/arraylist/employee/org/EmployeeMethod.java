package com.arraylist.employee.org;

import java.util.ArrayList;
//import java.util.stream.Collectors;

public class EmployeeMethod {
	
	void display(ArrayList<Employee> al) {
		al.stream().forEach(c -> System.out.println(c.id + " " + c.name + " " + c.salary+" "+c.role));
	}// End display

//	Employee FindMaximumSalary(ArrayList<Employee> al) {
//	    Employee max = al.get(0);
//	    for (int i = 1; i < al.size(); i++) {
//	        Employee e = al.get(i);
//	        if (e.salary > max.salary)
//	            max = e;  // Update the entire employee object
//	    }
//	    return max;
//	}

//	Employee FindMinimumSalary(ArrayList<Employee> al) {
//	    Employee min = al.get(0);
//	    for (int i = 1; i < al.size(); i++) {
//	        Employee e = al.get(i);
//	        if (e.salary < min.salary)
//	            min = e;  // Update the entire employee object
//	    }
//	    return min;
//	}

	ArrayList<Employee> IncrementSalary(ArrayList<Employee> al, double increment) {
		
		for (int i = 0; i < al.size(); i++) {
			Employee e = al.get(i);
			e.salary = (double)( e.salary +(e.salary * ((increment)/100)));
		}
		return al;
	}
	
//	ArrayList<Employee> filterByRole(ArrayList<Employee> al, String roleToFilter) {
//        return al.stream()
//                .filter(employee -> employee.getRole().equalsIgnoreCase(roleToFilter))
//                .collect(Collectors.toCollection(ArrayList::new));
//    }

}
