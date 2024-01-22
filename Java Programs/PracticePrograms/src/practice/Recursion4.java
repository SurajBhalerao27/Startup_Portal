package practice;

public class Recursion4 {
	static void reverseNum(int a) {
		if (a >= 1) {
			System.out.println(a);
			reverseNum(a - 1);
		}
	}

	public static void main(String[] args) {
		reverseNum(10);
	}
}
