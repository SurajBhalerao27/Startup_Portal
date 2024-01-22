package anudip.day9;

public class Employee {

	private int empId;
	private String name;
	private String designation;
	private double salary;

	public Employee() {
		/*
		 * // This is non parameterized blank constructor which we will used to create
		 * // empty Employees
		 */
	}

	/*
	 * Below we have created parameterized constructor used to set all values of the
	 * employee in its object at one go
	 */
	public Employee(int empId, String name, String designation, double salary) {
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public void setEmpID(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpid() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	/*
	 * toString method returns the string representation of the object
	 * 
	 * syntax
	 * 
	 * public String toString(){ return ""; }
	 * 
	 * As seen below toString method is used to fetch \ get all the data in all
	 * variables together Whenever we print the reference variable of and object
	 * toString method is automatically called and we will be able to see all the
	 * data stored in the object
	 * 
	 * example --->
	 * 
	 * Employee e2 = new Employee(); here e2 is the reference variable of the
	 * Employee object. Now we will print e2 System.out.println(e2);
	 * 
	 * 
	 * Now automatically toString method will be called and we will be able to see
	 * all the details on our console
	 */

	public String toString() {
		return "id= " + empId + "\nname= " + name + "\nDesignation= " + designation + "\nSalary= " + salary;
	}
}
