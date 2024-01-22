/*

			 *  *  *  *  *
			 *  *  *  *  *
			 *  *  *  *  *
			 *  *  *  *  *
			 *  *  *  *  *

*/
package pattern;

public class Cube {
	public static void main(String[] args) {
		int n = 5, i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}