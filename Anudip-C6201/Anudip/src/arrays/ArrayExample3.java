package arrays;

//Find the even from array.
import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		int[] rollNo = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter 5 number:....");

		for (int i = 0; i < rollNo.length; i++) {
			rollNo[i] = sc.nextInt();
		}
		System.out.println("All even number:");
		for (int i = 0; i < rollNo.length; i++) {
			if (rollNo[i] % 2 == 0) {
				System.out.println(rollNo[i]);
			}
		}
	}
}