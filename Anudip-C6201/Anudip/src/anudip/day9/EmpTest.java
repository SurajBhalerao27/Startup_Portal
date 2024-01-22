package anudip.day9;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Suraj");
		e1.setDesignation("software Developer");

		String name = e1.getName();
		String desig = e1.getDesignation();

		System.out.println("Name: " + name + "\nDesignation : " + desig);

		Employee e2 = new Employee(01, "Pramod", "Team Lead", 50000.0);

		String designation = e2.getDesignation();
		System.out.println("Designation of 2nd emp: " + designation);

		System.out.println("\n\nPrinting all details e2 together...\n" + e2);
		// System.out.println(e2);
	}

}
