package practice;

public class Recursion {
	static void printFunction(int a) {
		if (a > 1) {
			printFunction(a - 1);
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
//		HelloWorld h = new HelloWorld();
		printFunction(10);
	}
}