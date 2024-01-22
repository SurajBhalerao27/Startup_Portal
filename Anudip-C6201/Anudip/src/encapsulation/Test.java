/*Encapsulation : It is the hiding data.
 * We achieve encapsulation using access specifiers such as private.
 * */
package encapsulation;

class Employee {
	private int id;
	private String name;
	private double salary;

	public void setInt(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;    
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getInt() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Employee() {

	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

//	public void show() {
//		System.out.println("Id=" + id + "\nname=" + name + "\nsalary=" + salary);
//	}
}

public class Test {

	public static void main(String[] args) {

		Employee e = new Employee(), e2 = new Employee(600, "Pramod", 500000.00);
//		e.id = 101;  // here we gets an errror bcoz we make the variables private.
		e.setInt(101);
		e.setName("Suraj");
		e.setSalary(102225.0);
		// above are calls one by one

//		e2.show(); // here i uses show() method to print 

		// if i did not use anything then it will prints the hash code of that memory
		// location of object.

		// If i make the toString() method along the time of constructor then it will
		// automatically prints.

		System.out.println(e2.toString());

//		System.out.println(e2.toString());  // This is also printing the hash code even i calls the toString() by object of class

		double sal = e2.getSalary();
		System.out.println("This is salary of emp= " + sal);
		System.out.println(e2.getSalary());
	}

}
