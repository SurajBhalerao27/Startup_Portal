package demo6;

public class F {
	int factorial(int a) {
		int i, fact = 1;
		for (i = 1; i <= a; i++) {
			fact = fact * i;
		}
		return fact;
	}
}