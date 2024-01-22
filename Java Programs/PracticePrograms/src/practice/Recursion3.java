package practice;

public class Recursion3 {
	static int fibonacci(int n) {
		if (n <= 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

// fib number  1  1  2  3  5  8  13  21  34  55  89 ...

// Count -     0  1  2  3  4  5  6   7   8   9   10 ...

	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}
}
