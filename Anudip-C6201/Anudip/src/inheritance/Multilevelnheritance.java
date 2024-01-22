package inheritance;

class Employee {
	int emp_id;
	String company;

	public void markAttndance() {
		System.out.println("Your attendance has been marked");
	}
}

class Programmer extends Employee {
	String level;

	public void conding() {
		System.out.println("The programmer is coding as a " + level + " Programmer");
	}

}

class JavaDeveloper extends Programmer {
	String designation;
	String project;

	public void usingHibernate() {
		System.out.println("Java developer is using hibernate to create application");
	}

	@Override
	public String toString() {
		return "\nJavaDeveloper [designation= " + designation + ", project= " + project + ", level= " + level
				+ ", emp_id= " + emp_id + ", company= " + company + "]";
	}

}

public class Multilevelnheritance {

	public static void main(String[] args) {
		JavaDeveloper jd = new JavaDeveloper();
		jd.emp_id = 001;
		jd.company = "My Dream Company --> Persistance";
		jd.designation = "CEO";
		jd.level = "Higher level manager";
		jd.project = "High graphic game";

		jd.conding();
		jd.markAttndance();
		jd.usingHibernate();

		System.out.println("\nAll Detail of the Java Developer " + jd);
	}

}
