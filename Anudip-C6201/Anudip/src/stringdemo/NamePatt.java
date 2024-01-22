package stringdemo;

public class NamePatt {

	public static void main(String[] args) {
		String name = "Suraj";

		for (int i = name.length() - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(name.charAt(j));
			}
			System.out.println();
		}

	}

}
