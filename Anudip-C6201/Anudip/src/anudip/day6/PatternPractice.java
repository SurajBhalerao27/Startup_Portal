package anudip.day6;

public class PatternPractice {

	public static void main(String[] args) {
		int count = 1;

		System.out.println("_________1__" + "Pattern No : " + count + "__________");
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		count++;
		System.out.println("_________2__" + "Pattern No : " + count + "__________");
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		count++;
		System.out.println("________3___" + "Pattern No : " + count + "__________");
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}

		count++;
		System.out.println("________4___" + "Pattern No : " + count + "__________");
		System.out.println();
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}

		count++;
		System.out.println("________5___" + "Pattern No : " + count + "__________");
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}

		count++;
		System.out.println("_________6__" + "Pattern No : " + count + "__________");
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}

		count++;
		System.out.println("_________7__" + "Pattern No : " + count + "__________");
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}

		count++;
		System.out.println("_________8__" + "Pattern No : " + count + "__________");
		System.out.println();
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i % 2 == 0)
					System.out.print(" # ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}

		count++;
		System.out.println("________9___" + "Pattern No : " + count + "__________");
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j % 2 == 0)
					System.out.print(" # ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}

		count++;
		System.out.println("________10___" + "Pattern No : " + count + "__________");
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i >= j)
					System.out.print(" $ ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
