package pattern;

public class CubeOddNumber {

	public static void main(String[] args) {
		int i, j, n = 1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(!(n % 2 == 0) ? (n + " ") : (" "));
				n += 2;
			}
			System.out.println();
		}

	}

}
