package pattern;

/*
 * 1
 * 3 2
 * 4 5 6
 * 10 9 8 7
 * 11 12 13 14 15
 * 16 17 18 19 20 21
 * 28 27 26 25 24 23 22
 */
public class RigthTriangle {
	public static void main(String[] args) {
		int printer = 0;
		for (int i=1;i<=5;i++) {
			if (i%2==0) {
				printer += i-1;
			} else {
				printer += i;
			}
			for (int j=1;j<=i;j++) {
				System.out.print(printer+" ");
				if (i%2==0) {
					printer--;
				} else {
					printer++;
				}
			}
			System.out.println();
		}
	}
}
