package collections;

public class Employee implements Comparable<Employee> {
	
	private Integer empId;
	private String name;
	private Double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empId, String name, Double salary) {
		
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	public Integer getEmpId() {
		
		return empId;
	}

	public void setEmpId(Integer empId) {
		
		this.empId = empId;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public Double getSalary() {
		
		return salary;
	}

	public void setSalary(Double salary) {
		
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.salary.compareTo(o.salary);
	}
	
}
