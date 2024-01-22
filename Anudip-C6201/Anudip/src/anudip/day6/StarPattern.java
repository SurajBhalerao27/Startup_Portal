package anudip.day6;

public class StarPattern {
	int number;

	StarPattern(int n) {
		number = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("___________________________");
		System.out.println();
	}

	public static void main(String[] args) {
		StarPattern sp = new StarPattern(5);
		StarPattern sp1 = new StarPattern(8);
		StarPattern sp2 = new StarPattern(3);
	}

}
