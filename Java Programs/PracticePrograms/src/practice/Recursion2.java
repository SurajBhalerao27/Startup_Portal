package practice;

public class Recursion2 {
	static int factorial(int a) {
		if (a == 0 || a == 1) {
			return 1;
		}
//		System.out.println(a);
		return a * factorial(a - 1);
	}

	public static void main(String[] args) {
		System.out.println(factorial(8));
	}
}
