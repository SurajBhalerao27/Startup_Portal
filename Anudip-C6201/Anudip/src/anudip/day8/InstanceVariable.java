package anudip.day8;

public class InstanceVariable {

	class Coustomer {
		String name;
		String email;
		String dob;
		long mobile;
		boolean fresher;

		public Coustomer() {
			System.out.println("This is anudip an NGO");
		}

		public Coustomer(String name, String email, String dob, long mobile, boolean fresher) {
			/*
			 * 
			 * Below we are giving same variable identifier / name to the instance variable
			 * and local variable
			 * 
			 * so JVM could get confused net the two , hence we declare the instance
			 * variable names by using <<this>> keyword now JVM will understand that the
			 * data in local variable is to be stored inside the instance variable
			 */
			this.name = name;
			this.email = email;
			this.dob = dob;
			this.mobile = mobile;
			this.fresher = fresher;
		}

		public void display() {

		}

		@Override
		public String toString() {
			return "Coustomer [name=" + name + ", email=" + email + ", dob=" + dob + ", mobile=" + mobile + ", fresher="
					+ fresher + "]";
		}
	}
}
