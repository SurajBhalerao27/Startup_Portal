package arrays;

/*
 * Array=It is object which we can add multiple variable with fixed value but variable data type is always same.
 * Point to remember:-
 * 1)Size is Fixed we cannot add more than Size at runtime.
 * 2)Array accept all data of the same data type.
 * 3)All members have indexes Starting with 0 and end with -1.
 *  4)we can add and retrieve Data from Array using For loop.
 */
public class ArrayExample1 {
	public static void main(String[] args) {
		int rollNo = 10;
		int[] allrollNo = new int[5];
		allrollNo[0] = 100;
		allrollNo[1] = 12;
		allrollNo[2] = 156;
		allrollNo[3] = 45;
		allrollNo[4] = 56;

		// long cut
		System.out.println(allrollNo[1]);
		System.out.println(allrollNo[0]);
		System.out.println(allrollNo[2]);
		System.out.println(allrollNo[3]);
		System.out.println(allrollNo[4]);

		// short cut(Smart way)
		System.out.println("Using for loop");
		for (int i = 0; i < allrollNo.length; i++) {
			System.out.println(allrollNo[i]);
		}
	}
}
