package practice;

class Employee {
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

public class EncapsulationEx {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setSalary(10000);
		System.out.println(employee.getSalary());
	}
}
