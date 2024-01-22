package practice;

public class FindSqrt {
	public static void main(String[] args) {
//		int num = 64;
//		do {
//			int sqrt = num / 2;
//			sqrt--;
//			System.out.println(sqrt);
//		} while (num >= 0);

		int num = 64;
		int sqrt = num / 2; // Initialize the square root guess

		// Use a loop to refine the guess
		while (sqrt * sqrt > num) {
			sqrt--;
		}

		// Print the result
		System.out.println("Square root of " + num + " is approximately: " + sqrt);
	}

}
