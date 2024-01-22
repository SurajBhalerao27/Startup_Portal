package pattern;
/*
 * 5 5 5 5 5 5 5 5 5
 * 5 4 4 4 4 4 4 4 5
 * 5 4 3 3 3 3 3 4 5
 * 5 4 3 3 2 3 3 4 5
 * 5 4 3 2 1 2 3 4 5
 * 5 4 3 3 2 3 3 4 5
 * 5 4 3 3 3 3 3 4 5
 * 5 4 4 4 4 4 4 4 5
 * 5 5 5 5 5 5 5 5 5
 */
public class MainPattern {
	public static void main(String[] args) {
		for (int i=1;i<=9;i++) {
			for (int j=1; j<=9;j++) {
				if (i==1 || i==9 || j==1 || j==9) {
					System.out.print(5);
				} else if (i==2 || i==8 || j==2 || j==8) {
					System.out.print(4);
				} else if (i==3 || i==7 || j==3 || j==7) {
					System.out.print(3);
				} else if (i==4 || i==6 || j==4 || j==6) {
					System.out.print(2);
				} else {
					System.out.print(1);
				}
			}
			System.out.println();
		}
	}
}
