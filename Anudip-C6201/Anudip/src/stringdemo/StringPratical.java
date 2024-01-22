package stringdemo;


public class StringPratical {

	public static void main(String[] args) {
		String name = "Chaitali";
		String rev = "";

		for (int i = name.length(); i > 0; i--) {
			rev = rev + name.charAt(i);

		}
		boolean n = rev.equals(name);
		if (n == true) {
			System.out.println("It is palidrome");

		} else {
			System.out.println("It is not palidrome");

		}
	}

}
