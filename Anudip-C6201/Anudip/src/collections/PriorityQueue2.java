package collections;

import java.util.PriorityQueue;

public class PriorityQueue2 {

	public static void main(String[] args) {
		
		PriorityQueue<Employee> empQ=new PriorityQueue<Employee>(new ComparableEmpName());
		/*
		 * If we use below method then no need to create CompareEmpName class, we are giving 
		 * all the code in constructor of PriorityQueue by using lambda expression.
		 *
		 * PriorityQueue<Employee> empQ=new PriorityQueue<Employee>((e1,e2)->{
		 * return e1.getName().compareTo(e2.getName());
		 * });
		*/
		empQ.add(new Employee(201,"Sanjay",90000.0));
		empQ.add(new Employee(1,"Sharda",5517.9));
		empQ.add(new Employee(5,"Aasha",700000.9));
		empQ.add(new Employee(20,"Ajay",46489.87));
		empQ.add(new Employee(451,"Meera",60098.0));
		
		System.out.println(empQ);

	}

}
