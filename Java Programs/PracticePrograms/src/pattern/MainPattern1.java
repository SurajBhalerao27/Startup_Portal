package pattern;

public class MainPattern1 {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 3; j++) {
//				if (!(j % 2 == 0)) {
				System.out.print(j + " " + i + " ");
//				} else {
//				System.out.print(i + " ");
//				}

			}
			System.out.println();
		}
	}
}
