package pattern;
/*
 * 1
 * 2 6
 * 3 7 10
 * 4 8 11 13
 * 5 9 12 14 15
 */
public class RigthTriangleNumber {
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			int k = 4;
			int printer = i;
			for (int j=1;j<=i;j++) {
				System.out.print(printer+" ");
				printer +=k;
				k--;
			}
			System.out.println();
		}
	}
}
