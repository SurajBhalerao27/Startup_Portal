package pojoClassDemo;
/*
 * ToString=It is method used for to print the data which set by setter method.
 * Syntax=
 * public String toString()
 * At time of calling
 * we are call on object
 * System.out.println(Object name);
 * ToString=getter method
 * for getter method,we can use shortcut as ToString.
 * getter method increase complexity.
 */

class Employee{
	private String Empid;
	private String name;
	private String Designation;
	private double Salary;
	
	public Employee() {
		
		System.out.println("Non-parametreized constructor!");
		
	}
	
	public String getEmpid() {
		return Empid;
	}
	
	public void setEmpid(String empid) {
		Empid = empid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesignation() {
		return Designation;
	}
	
	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	public double getSalary() {
		return Salary;
	}
	
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public String toString() {
		return "Employee [Empid=" + Empid + ", name=" + name + ", Designation=" + Designation + ", Salary=" + Salary
				+ "]";
	}
	
	
	
	
	
	
}

public class GetterAndSetterObject {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpid("chaitalibarhate@gmail.com");
		e.setName("chaitali");
		e.setSalary(560000d);
		e.setDesignation("Software engineer");
		String em=e.getEmpid();
		String n=e.getName();
		double s=e.getSalary();
		String d=e.getDesignation();
		System.out.println("Details of employee");
		System.out.println("Name of employee:"+n+"\nEmail id of employee:"+em+"\nDesignation of employee:"+d
				+"\nsalary of employee:"+s);
		System.out.println(e);// Important syntax	

	}

}
