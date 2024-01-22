/*

			 1  6 11 16 21
			 2  7 12 17 22
			 3  8 13 18 23
			 4  9 14 19 24
			 5 10 15 20 25

*/

package pattern;

public class NumberSeries {
	public static void main(String[] args) {
		int i, j, n;
		for (i = 1; i <= 5; i++) {
			n = i;
			for (j = 1; j <= 5; j++) {

				System.out.printf("%2d", n);
				System.out.print(" ");
				n += 5;
			}
			System.out.println();
		}
	}
}
